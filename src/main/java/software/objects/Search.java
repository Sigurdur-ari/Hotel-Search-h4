package software.objects;

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

    public void initialSearch(String location, String checkInDate, String checkOutDate, int partySize) {
        //probably should return something to confirm it worked?
        this.location = location;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.partySize = partySize;
        //TODO: actual initial search maybe this class needs a list of all hotels?
    }

    public void searchAgain() {
        //TODO
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

    public boolean isAccessibility() {  // "is" instead of "get" for boolean
        return accessibility;
    }

    public boolean isPets() {
        return pets;
    }

    public boolean isRefundable() {
        return refundable;
    }
}
