package software.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import software.Database;
import software.objects.Booking;

import java.io.IOException;
import java.util.ArrayList;

public class BookingItemController {

    @FXML public Button removeButton;
    @FXML private Label hotelName;
    @FXML private Label checkInDate;
    @FXML private Label checkOutDate;
    @FXML private Label locationLabel;
    @FXML private Label roomNum;
    @FXML private Label capacity;
    @FXML private Label userName;
    @FXML private Label totalPrice;
    @FXML private Label refundable;

    @FXML private HBox rootHBox;
    @FXML private VBox hotelInfoBox;
    @FXML private VBox roomInfoBox;
    @FXML private VBox paymentInfoBox;
    @FXML public VBox buttonBox;

    public void initialize() {
        // Bind VBox widths to a percentage of the HBox width
        hotelInfoBox.prefWidthProperty().bind(rootHBox.widthProperty().multiply(0.29));  // 40% width
        roomInfoBox.prefWidthProperty().bind(rootHBox.widthProperty().multiply(0.29));   // 30% width
        paymentInfoBox.prefWidthProperty().bind(rootHBox.widthProperty().multiply(0.29)); // 30% width
        buttonBox.prefWidthProperty().bind(rootHBox.widthProperty().multiply(0.13)); // 10% width
    }

    public void setBookingData(Booking booking) {
        hotelName.setText(booking.getHotelName());
        checkInDate.setText(booking.getCheckInDate());
        checkOutDate.setText(booking.getCheckOutDate());
        locationLabel.setText(booking.getLocation());
        roomNum.setText(Integer.toString(booking.getRoomNum()));
        capacity.setText(Integer.toString(booking.getCapacity()));
        userName.setText(booking.getUserName());
        totalPrice.setText(Integer.toString(booking.getTotalPrice()));
        refundable.setText(booking.isRefundable() ? "Yes" : "No");
    }

    public void handleRemove(ActionEvent actionEvent) {
        Database db = new Database();
        db.removeBooking(hotelName.getText(), Integer.parseInt(roomNum.getText()));

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/BookingView.fxml"));
            Parent root = loader.load();

            //Tengja við bookingview til að resetta listanum eftir eyðingu.
            BookingViewController bwc = loader.getController();
            ArrayList<Booking> bookings = db.getAllBookings();
            bwc.setBookings(bookings);

            //random hlutur valinn til að fá window.
            Stage stage = (Stage) hotelName.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
