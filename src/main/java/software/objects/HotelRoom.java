package software.objects;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HotelRoom {
    private final String hotelName;
    private final String dateAvailable;
    private final int roomNumber;
    private final int capacity;
    private final int pricePerNight;
    private final boolean refundable;
    private boolean booked;

    public HotelRoom(String hotelName, String dateAvailable, int roomNumber, int capacity, int pricePerNight, boolean refundable, boolean booked) {
        this.hotelName = hotelName;
        this.dateAvailable = dateAvailable;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.refundable = refundable;
        this.booked = booked;
    }

    public boolean isAvailable(Search query) {
        boolean date = dateAvailable.equals(query.getCheckInDate());
        boolean size = capacity >= query.getPartySize();

        // Er hér ef við viljum filtera eftir total price
        //LocalDate date1 = LocalDate.parse(dateAvailable);
        //LocalDate date2 = LocalDate.parse(query.getCheckOutDate());
        //long daysBetween = ChronoUnit.DAYS.between(date1, date2);

        boolean minPrice = query.getMinPrice() <= pricePerNight;
        boolean maxPrice = pricePerNight <= query.getMaxPrice();
        return date && size && minPrice && maxPrice && !booked;
    }

    public Booking bookRoom(Search query, User user, Hotel hotel) {
        LocalDate start = LocalDate.parse(query.getCheckInDate());
        LocalDate end = LocalDate.parse(query.getCheckOutDate());
        long dayDiff = ChronoUnit.DAYS.between(start, end);
        int totalPrice = (int) dayDiff * pricePerNight;
        booked = true;
        return new Booking(this.hotelName, user.getUserName(), this.roomNumber, totalPrice, query.getCheckInDate(), query.getCheckOutDate(), capacity, hotel.getLocation(), refundable);
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getDateAvailable() {
        return dateAvailable;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public boolean isRefundable() {
        return refundable;
    }
}
