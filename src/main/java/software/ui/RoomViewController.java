package software.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import software.objects.Hotel;
import software.objects.HotelRoom;
import software.objects.Search;

import java.io.IOException;
import java.util.ArrayList;

public class RoomViewController {
    @FXML
    public Label hotelRoomTitle;
    @FXML
    public ListView<HBox> roomListView;

    private Search search;
    private Hotel hotel;

    //Tengir við roomItem og setur upp data til að fylla listview.
    public void setRooms(ArrayList<HotelRoom> availableRooms){
        roomListView.getItems().clear();
        for (HotelRoom room : availableRooms) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/RoomItem.fxml"));
                Parent roomItem = loader.load();

                // Get the controller for the item
                RoomItemController controller = loader.getController();
                // Set the data for the hotel room
                controller.setRoomData(hotel, room, search);

                // Add item to ListView
                roomListView.getItems().add((HBox)roomItem);

            } catch (IOException e) {
                System.err.println("Error loading FXML: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public void setSearch(Search search){
        this.search = search;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    //Setur titilinn á fxml hlutnum.
    public void setTitle(Hotel hotel) {
        hotelRoomTitle.setText("Rooms available at " + hotel.getName());
    }

    public void handleBack() {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/HotelView.fxml"));
            Parent root = loader.load();

            Search newSearch = new Search(search.getAllHotels());

            ArrayList<Hotel> availableHotels = newSearch.initialSearch(search.getLocation(),
                    search.getCheckInDate(),
                    search.getCheckOutDate(),
                    search.getPartySize());


            HotelViewController hotelViewController = loader.getController();
            hotelViewController.setSearch(search);
            hotelViewController.setHotels(availableHotels);

            //random hlutur valinn til að fá window.
            Stage stage = (Stage) roomListView.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
