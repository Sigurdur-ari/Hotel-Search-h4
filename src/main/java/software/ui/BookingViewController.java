package software.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import software.objects.Booking;

import java.io.IOException;
import java.util.ArrayList;

public class BookingViewController {

    @FXML private ListView<HBox> bookingListView;

    public void setBookings(ArrayList<Booking> Bookings){
        bookingListView.getItems().clear();
        for (Booking booking : Bookings) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/BookingItem.fxml"));
                Parent bookingItem = loader.load();

                // Get the controller for the item
                BookingItemController controller = loader.getController();
                // Set the data for the booking
                controller.setBookingData(booking);

                // Add item to ListView
                bookingListView.getItems().add((HBox)bookingItem);

            } catch (IOException e) {
                System.err.println("Error loading FXML: " + e.getMessage());
                e.printStackTrace();  // Print the full stack trace for debugging
            }
        }
    }
}
