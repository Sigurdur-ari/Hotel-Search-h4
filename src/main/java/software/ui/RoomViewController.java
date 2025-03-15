package software.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
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

    public void setRooms(ArrayList<HotelRoom> availableRooms){
        roomListView.getItems().clear();
        for (HotelRoom room : availableRooms) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/RoomItem.fxml"));
                Parent roomItem = loader.load();

                // Get the controller for the item
                RoomItemController controller = loader.getController();
                // Set the data for the hotel room
                controller.setRoomData(room, search);

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

    public void setTitle(Hotel hotel) {
        hotelRoomTitle.setText("Rooms available at " + hotel.getName());
    }
}
