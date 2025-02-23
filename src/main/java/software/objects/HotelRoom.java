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

    public HotelRoom(String hotelName, String dateAvailable, int roomNumber, int capacity, int pricePerNight, boolean refundable) {
        this.hotelName = hotelName;
        this.dateAvailable = dateAvailable;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.refundable = refundable;
    }

    public boolean isAvailable(Search query) {
        boolean date = dateAvailable.equals(query.getCheckInDate());
        boolean size = capacity <= query.getPartySize();

        LocalDate date1 = LocalDate.parse(dateAvailable);
        LocalDate date2 = LocalDate.parse(query.getCheckOutDate());
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);

        boolean minPrice = query.getMinPrice() <= pricePerNight * daysBetween;
        boolean maxPrice = pricePerNight * daysBetween <= query.getMaxPrice();
        return date && size && minPrice && maxPrice;
    }

    public void bookRoom(Search Query) {
        //TODO
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
