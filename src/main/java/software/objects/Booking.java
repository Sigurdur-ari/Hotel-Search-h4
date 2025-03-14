package software.objects;

public class Booking {
    private final String hotelName;
    private final String userName;
    private final int roomNum;
    private final int totalPrice;
    private final String checkInDate;
    private final String checkOutDate;
    private final int capacity;
    private final String location;
    private final boolean refundable;

    public Booking(String hotelName, String userName, int roomNum, int totalPrice, String checkInDate, String checkOutDate, int capacity, String location, boolean refundable) {
        this.hotelName = hotelName;
        this.userName = userName;
        this.roomNum = roomNum;
        this.totalPrice = totalPrice;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.capacity = capacity;
        this.location = location;
        this.refundable = refundable;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getUserName() {
        return userName;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getLocation() {
        return location;
    }

    public boolean isRefundable() {
        return refundable;
    }
}
