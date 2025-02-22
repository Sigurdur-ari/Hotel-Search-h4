package software;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Database {
    private static final String DATABASE_NAME = "sql/data.db";
    private static final String SCHEMA_FILE = "sql/schema.sql";
    private static final String INSERT_FILE = "sql/insert.sql";
    private Connection connection;

    public Database() {
        initializeDatabase();
    }

    private void initializeDatabase() {
        try {
            if (!Files.exists(Paths.get(DATABASE_NAME))) {
                connection = DriverManager.getConnection("jdbc:sqlite:" + DATABASE_NAME);
                executeSQLFile(SCHEMA_FILE);
                executeSQLFile(INSERT_FILE);
                makeRooms(10);
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
                    System.out.println(pair);

                    if (!uniqueRooms.contains(pair)) {
                        uniqueRooms.add(pair);
                        int capacity = random.nextInt(12) + 1;
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
}
