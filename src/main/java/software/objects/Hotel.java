package software.objects;

import java.util.ArrayList;

public class Hotel {
    private final String name;
    private final String location;
    private final float rating;
    private final int ratingCount;
    private final boolean accessibility;
    private final boolean pets;
    private final boolean refundable;
    private final String checkInTime;
    private final String checkOutTime;
    private final String photoURL;
    private final ArrayList<HotelRoom> rooms;
    private final int cheapestRoom;

    public Hotel(String name, String location, float rating, int ratingCount, boolean accessibility, boolean pets, boolean refundable, String checkInTime, String checkOutTime, String photoURL, ArrayList<HotelRoom> rooms) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.ratingCount = ratingCount;
        this.accessibility = accessibility;
        this.pets = pets;
        this.refundable = refundable;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.photoURL = photoURL;
        this.rooms = rooms;
        this.cheapestRoom = findCheapestRoom();
    }

    private int findCheapestRoom(){
        int cheapest = Integer.MAX_VALUE;
        for(HotelRoom room: rooms){
            if(cheapest > room.getPricePerNight()){
                cheapest = room.getPricePerNight();
            }
        }
        return cheapest;
    }

    public boolean isAvailable(Search query) {
        boolean place = location.equals(query.getLocation());
        boolean minRating = query.getMinRating() <= rating;
        boolean maxRating = rating <= query.getMaxRating();
        boolean petsAllowed = !query.petsAllowed() || pets;
        boolean accessible = !query.isAccessible() || accessibility;
        boolean refunds = !query.isRefundable() || refundable;

        if (place && minRating && maxRating && petsAllowed && accessible && refunds) {
            for (HotelRoom room : rooms) {
                if (room.isAvailable(query)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public float getRating() {
        return rating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public boolean isAccessible() {
        return accessibility;
    }

    public boolean isPetsAllowed() {
        return pets;
    }

    public boolean isRefundable() {
        return refundable;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public ArrayList<HotelRoom> getRooms() {
        return new ArrayList<>(rooms);
    }

    public int getCheapestRoom(){
        return cheapestRoom;
    }

    @Override
    public String toString() {
        return "Hotel{name='" + name + "', " +
                "location=" + location + "', " +
                "rating= " + rating + "', " +
                "ratingCount= " + ratingCount + "', " +
                "accessibility= " + accessibility + "', " +
                "pets=" + pets + "', " +
                "refundable=" + refundable + "', " +
                "checkInTime=" + checkInTime + "', " +
                "checkOutTime=" + checkOutTime + "', " +
                "photoURL=" + photoURL + "',}";
    }
}
