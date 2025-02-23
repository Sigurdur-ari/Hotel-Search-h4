package software.objects;

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

    public boolean isAvailable(Search query) {
        //TODO
        return true;
    }

    public void bookRoom(Search Query) {
        //TODO: will become public Booking bookRoom()
    }
}
