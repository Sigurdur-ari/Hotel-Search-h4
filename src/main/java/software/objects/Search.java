package software.objects;

import java.util.ArrayList;

public class Search {
    private String location;
    private String checkInDate;
    private String checkOutDate;
    private int partySize;
    private float minRating;
    private float maxRating;
    private int minPrice;
    private int maxPrice;
    private boolean accessibility;
    private boolean pets;
    private boolean refundable;
    private final ArrayList<Hotel> hotels;

    public Search(ArrayList<Hotel> hotels) {
        this.location = null;
        this.checkInDate = null;
        this.checkOutDate = null;
        this.partySize = 0;
        this.minRating = 0.0f;
        this.maxRating = Float.POSITIVE_INFINITY;
        this.minPrice = 0;
        this.maxPrice = Integer.MAX_VALUE;
        this.accessibility = false;
        this.pets = false;
        this.refundable = false;
        this.hotels = hotels;
    }

    public ArrayList<Hotel> initialSearch(String location, String checkInDate, String checkOutDate, int partySize) {
        this.location = location;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.partySize = partySize;

        ArrayList<Hotel> validHotels = new ArrayList<>();

        for (Hotel hotel : hotels) {
            if (hotel.isAvailable(this)) {
                validHotels.add(hotel);
            }
        }

        return validHotels;
    }

    public ArrayList<Hotel> searchAgain() {
        ArrayList<Hotel> validHotels = new ArrayList<>();

        for (Hotel hotel : hotels) {
            if (hotel.isAvailable(this)) {
                validHotels.add(hotel);
            }
        }

        return validHotels;
    }

    public void updateRating(int minRating, int maxRating) {
        this.minRating = minRating;
        this.maxRating = maxRating;
    }

    public void updatePrice(int minPrice, int maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public void updateAccessibility(boolean accessibility) {
        this.accessibility = accessibility;
    }

    public void updatePets(boolean pets) {
        this.pets = pets;
    }

    public void updateRefundable(boolean refundable) {
        this.refundable = refundable;
    }

    public ArrayList<Hotel> getAllHotels(){
        return hotels;
    }

    public String getLocation() {
        return location;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public int getPartySize() {
        return partySize;
    }

    public float getMinRating() {
        return minRating;
    }

    public float getMaxRating() {
        return maxRating;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public boolean isAccessible() {
        return accessibility;
    }

    public boolean petsAllowed() {
        return pets;
    }

    public boolean isRefundable() {
        return refundable;
    }
}
