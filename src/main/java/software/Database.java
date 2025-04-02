package software;

import software.objects.Booking;
import software.objects.Hotel;
import software.objects.HotelRoom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.*;

public class Database {
    private static final String DATABASE_NAME = "sql/data.db";
    private static final String SCHEMA_FILE = "sql/schema.sql";
    private static final String INSERT_FILE = "sql/insert.sql";
    private Connection connection;

    public Database() {
        initializeDatabase();
    }

    /**
     * A function that returns the hotel arraylist
     * @return list of all hotels in the database
     */
    public ArrayList<Hotel> getHotels(){
        return makeHotels();
    }

    public ArrayList<Hotel> makeHotels() {
        ResultSet rs1 = query("SELECT * FROM hotels");
        ArrayList<Hotel> allHotels = new ArrayList<Hotel>();
        try {
            while (rs1.next()) {
                String hotelName = rs1.getString("name");
                String location = rs1.getString("location");
                float rating = rs1.getFloat("rating");
                int ratingCount = rs1.getInt("ratingCount");
                boolean refundable = rs1.getInt("refundable") == 1;
                boolean pets = rs1.getInt("pets") == 1;
                boolean accessibility = rs1.getInt("accessibility") == 1;
                String photoURL = rs1.getString("photoURL");
                String checkInTime = rs1.getString("checkInTime");
                String checkOutTime = rs1.getString("checkOutTime");
                ArrayList<HotelRoom> hotelsRooms = new ArrayList<HotelRoom>();

                ResultSet rs2 = query("SELECT * FROM hotelRooms WHERE hotelName = '" + hotelName + "'");
                while (rs2.next()) {
                    String dateAvailable = rs2.getString("date");
                    int roomNumber = rs2.getInt("roomNum");
                    int capacity = rs2.getInt("capacity");
                    int pricePerNight = rs2.getInt("pricePerNight");
                    ResultSet rs3 = query("SELECT * FROM booking WHERE hotelName = '" + hotelName + "' AND roomNumber = '" + roomNumber + "'");
                    boolean booked = rs3.next();
                    closeRS(rs3);
                    hotelsRooms.add(new HotelRoom(hotelName, dateAvailable, roomNumber, capacity, pricePerNight, refundable, booked));
                }
                closeRS(rs2);

                allHotels.add(new Hotel(hotelName, location, rating, ratingCount, accessibility, pets, refundable, checkInTime, checkOutTime, photoURL, hotelsRooms));
            }
            closeRS(rs1);
            return allHotels;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void initializeDatabase() {
        try {
            if (!Files.exists(Paths.get(DATABASE_NAME))) {
                connection = DriverManager.getConnection("jdbc:sqlite:" + DATABASE_NAME);
                executeSQLFile(SCHEMA_FILE);
                executeSQLFile(INSERT_FILE);
                //makeRooms(10);
            }
            else {
                connection = DriverManager.getConnection("jdbc:sqlite:" + DATABASE_NAME);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void executeSQLFile(String fileName) {
        Path fileURL = Path.of(fileName);
        try {
            if (Files.exists(fileURL)) {
                String sql = Files.readString(fileURL);
                try (Statement stmt = connection.createStatement()) {
                    stmt.executeUpdate(sql);
                }
            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet query(String queryString) {
        try {
            Statement stmt = connection.createStatement();
            return stmt.executeQuery(queryString);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    private void makeRooms(int roomAmount) {
        Random random = new Random();

        try {
            ResultSet rs = query("SELECT name FROM hotels");
            while (rs.next()) {
                Set<String> uniqueRooms = new HashSet<>();
                String hotelName = rs.getString("name");
                System.out.println("Creating rooms for hotel: " + hotelName);  // Log the hotel name
                while (uniqueRooms.size() < roomAmount) {
                    int year = 2025;
                    int month = random.nextInt(3) + 5;
                    int day = random.nextInt(28) + 1; //bara upp í 28 svo það virkar fyrir alla mánuði
                    String date = String.format("%04d-%02d-%02d", year, month, day);

                    int roomNumber = random.nextInt(900) + 100;
                    String pair = date + " & " + roomNumber;
                    System.out.println(pair); // Log the date and room number

                    if (!uniqueRooms.contains(pair)) {
                        uniqueRooms.add(pair);
                        int capacity = random.nextInt(7) + 1;
                        System.out.println(capacity); //log the capacity
                        int price = (random.nextInt(20) + 1) * 1000;

                        String insertQuery = "INSERT INTO hotelRooms (hotelName, date, roomNum, capacity, pricePerNight) VALUES (?, ?, ?, ?, ?)";
                        try (PreparedStatement stmt = connection.prepareStatement(insertQuery)) {
                            stmt.setString(1, hotelName);
                            stmt.setString(2, date);
                            stmt.setInt(3, roomNumber);
                            stmt.setInt(4, capacity);
                            stmt.setInt(5, price);
                            stmt.executeUpdate();
                        }
                    }
                }
            }
            closeRS(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeRS(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void close() {
        try {
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean makeBooking(Booking booking) {
        String query = "INSERT INTO booking (hotelName, username, roomNumber, totalPrice, checkInDate, checkOutDate, capacity, location, isRefundable) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int isRefundable = booking.isRefundable() ? 1 : 0;
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, booking.getHotelName());
            stmt.setString(2, booking.getUserName());
            stmt.setInt(3, booking.getRoomNum());
            stmt.setInt(4, booking.getTotalPrice());
            stmt.setString(5, booking.getCheckInDate());
            stmt.setString(6, booking.getCheckOutDate());
            stmt.setInt(7, booking.getCapacity());
            stmt.setString(8, booking.getLocation());
            stmt.setInt(9, isRefundable);

            int rowsInserted = stmt.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Booking inserted successfully!");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<Booking> getAllBookings() {
        try {
            ResultSet rs = query("SELECT * FROM booking");
            ArrayList<Booking> allBookings = new ArrayList<>();
            while (rs.next()) {
                String hotelName = rs.getString("hotelName");
                String username = rs.getString("username");
                int roomNumber = rs.getInt("roomNumber");
                int totalPrice = rs.getInt("totalPrice");
                String checkInDate = rs.getString("checkInDate");
                String checkOutDate = rs.getString("checkOutDate");
                int capacity = rs.getInt("capacity");
                String location = rs.getString("location");
                int isRefundable = rs.getInt("isRefundable");
                Booking booking = new Booking(hotelName, username, roomNumber, totalPrice, checkInDate, checkOutDate, capacity, location, isRefundable == 1);
                allBookings.add(booking);
            }
            closeRS(rs);
            return allBookings;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean removeBooking(String hotelName, int roomNumber){
        String query = "DELETE FROM booking WHERE hotelName = ? AND roomNumber = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, hotelName);
            stmt.setInt(2, roomNumber);

            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Booking deleted successfully!");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
