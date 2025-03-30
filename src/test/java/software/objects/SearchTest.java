package software.objects;

import org.junit.jupiter.api.*;
/* IntelliJ did not want to have all this and auto fixed to *, here is every import used though
 * import org.junit.jupiter.api.AfterEach;
 * import org.junit.jupiter.api.Assertions;
 * import org.junit.jupiter.api.BeforeEach;
 * import org.junit.jupiter.api.Test;
 * import org.junit.jupiter.api.DisplayName;
 **/
import java.util.ArrayList;

class SearchTest {
    //Object we will mock
    private ArrayList<Hotel> hotels;
    private ArrayList<HotelRoom> rooms;
    private Search SC;

    //Data lists for the setup of the mock objects
    private final String[] nameList = {"Good Hotel rey", "Bad Hotel rey", "Good Hotel ak", "Bad Hotel ak"};
    private final String[] locationList = {"Reykjavík", "Reykjavík", "Akureyri", "Akureyri"};
    private final Integer[] ratingList = {8, 3, 9, 4};
    private final boolean[] boolList = {true, false, true, false};
    private final String[] dateAvailableList = {
            "2025-05-10", "2025-05-10",
            "2025-05-10", "2025-05-10",
            "2025-05-10", "2025-05-10",
            "2025-05-10", "2025-05-10"};
    private final Integer[] capacityList = {2,2,2,2,2,2,2,2};
    private final Integer[] priceList = {100, 1000, 5000, 20000, 100, 1000, 5000, 20000};

    @BeforeEach
    void setup(){
        hotels = new ArrayList<>();
        rooms = new ArrayList<>();

        //Make 8 rooms
        for(int i = 0; i < capacityList.length; i++){
            int k = (i % 2 != 0) ? 1 : 0;
            rooms.add(new HotelRoom(
                    nameList[k],
                    dateAvailableList[i],
                    k+1,
                    capacityList[i],
                    priceList[i],
                    boolList[k],
                    false)
            );
        }

        //Make 4 hotels using the rooms above
        for(int i = 0; i < nameList.length; i++){
            ArrayList<HotelRoom> thisRooms = new ArrayList<>();
            thisRooms.add(rooms.get(i*2));
            thisRooms.add(rooms.get(i*2+1));

            hotels.add(new Hotel(
                    nameList[i],
                    locationList[i],
                    ratingList[i],
                    100,
                    boolList[i],
                    boolList[i],
                    boolList[i],
                    "15:30",
                    "11:00",
                    "test.png",
                    thisRooms
            ));
        }
        //Initialize the search controller with the hotels
        SC = new Search(hotels);
    }

    @Test
    @DisplayName("Should return all hotels")
    void GetHotels() {
        ArrayList<Hotel> expected = hotels;
        Assertions.assertEquals(expected, SC.getAllHotels());
    }

    @Test
    @DisplayName("Should only include hotels in Reykjavík, none in Akureyri")
    void initialSearch(){
        ArrayList<Hotel> availableHotels = new ArrayList<>(SC.initialSearch("Reykjavík", "2025-05-10", "2025-05-17", 2));
        Assertions.assertFalse(availableHotels.isEmpty(), "No hotels found, but some were expected.");

        Hotel goodHotelRey = hotels.get(0);
        Assertions.assertTrue(availableHotels.contains(goodHotelRey), "Good hotel rey should be available");

        Hotel badHotelAk = hotels.get(hotels.size()-1);
        Assertions.assertFalse(availableHotels.contains(badHotelAk), "Bad Hotel in ak should not be in availableHotels.");
    }

    @Test
    @DisplayName("Should only include hotels with rating between 2 and 5, others should be omitted")
    void filterByRating(){
        SC.initialSearch("Reykjavík", "2025-05-10", "2025-05-17", 2);
        SC.updateRating(2,5);
        ArrayList<Hotel> availableHotels = new ArrayList<>(SC.searchAgain());
        Assertions.assertFalse(availableHotels.isEmpty(), "No hotels found, but some were expected.");

        Hotel badHotelRey = hotels.get(1);
        Assertions.assertTrue(availableHotels.contains(badHotelRey), "Bad hotel rey should be available");

        Hotel goodHotelRey = hotels.get(0);
        Assertions.assertFalse(availableHotels.contains(goodHotelRey), "Good hotel rey should not be in availableHotels.");
    }

    @Test
    @DisplayName("Should only include hotels with price between 4000 and 21000, others should be omitted")
    void filterByPrice(){
        SC.initialSearch("Reykjavík", "2025-05-10", "2025-05-17", 2);
        SC.updatePrice(4000,21000);
        ArrayList<Hotel> availableHotels = new ArrayList<>(SC.searchAgain());
        Assertions.assertFalse(availableHotels.isEmpty(), "No hotels found, but some were expected.");

        Hotel goodHotel = hotels.get(0);
        Assertions.assertFalse(availableHotels.contains(goodHotel), "Good hotel rey should not be available");

        Hotel badHotel = hotels.get(1);
        Assertions.assertTrue(availableHotels.contains(badHotel), "Bad Hotel rey should be in availableHotels.");
    }

    @Test
    @DisplayName("Should only include hotels that are accessible, others should be omitted")
    void filterByAccessibility(){
        SC.initialSearch("Reykjavík", "2025-05-10", "2025-05-17", 2);
        SC.updateAccessibility(true);
        ArrayList<Hotel> availableHotels = new ArrayList<>(SC.searchAgain());
        Assertions.assertFalse(availableHotels.isEmpty(), "No hotels found, but some were expected.");

        Hotel goodHotel = hotels.get(0);
        Assertions.assertTrue(availableHotels.contains(goodHotel), "Good hotel rey should be available");

        Hotel badHotel = hotels.get(1);
        Assertions.assertFalse(availableHotels.contains(badHotel), "Bad Hotel rey should not be in availableHotels.");
    }

    @Test
    @DisplayName("Should only include hotels that allow pets, others should be omitted")
    void filterByPets(){
        SC.initialSearch("Reykjavík", "2025-05-10", "2025-05-17", 2);
        SC.updatePets(true);
        ArrayList<Hotel> availableHotels = new ArrayList<>(SC.searchAgain());
        Assertions.assertFalse(availableHotels.isEmpty(), "No hotels found, but some were expected.");

        Hotel goodHotel = hotels.get(0);
        Assertions.assertTrue(availableHotels.contains(goodHotel), "Good hotel rey should be available");

        Hotel badHotel = hotels.get(1);
        Assertions.assertFalse(availableHotels.contains(badHotel), "Bad Hotel rey should not be in availableHotels.");
    }

    @Test
    @DisplayName("Should only include hotels that are refundable, others should be omitted")
    void filterByRefundable(){
        SC.initialSearch("Reykjavík", "2025-05-10", "2025-05-17", 2);
        SC.updateRefundable(true);
        ArrayList<Hotel> availableHotels = new ArrayList<>(SC.searchAgain());
        Assertions.assertFalse(availableHotels.isEmpty(), "No hotels found, but some were expected.");

        Hotel goodHotel = hotels.get(0);
        Assertions.assertTrue(availableHotels.contains(goodHotel), "Good hotel rey should be available");

        Hotel badHotel = hotels.get(1);
        Assertions.assertFalse(availableHotels.contains(badHotel), "Bad Hotel rey should not be in availableHotels.");
    }

    @Test
    @DisplayName("Should not have any hotels")
    void noHotelsMatchFilter() {
        SC.initialSearch("Reykjavík", "2025-05-10", "2025-05-17", 2);
        SC.updateRating(10, 10);
        ArrayList<Hotel> availableHotels = new ArrayList<>(SC.searchAgain());
        Assertions.assertTrue(availableHotels.isEmpty(), "Expected no hotels, but some were found.");
    }

    @AfterEach
    void tearDown(){
        rooms = null;
        hotels = null;
        SC = null;
    }

}
