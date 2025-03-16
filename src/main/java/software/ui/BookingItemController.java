package software.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import software.objects.Booking;

public class BookingItemController {

    @FXML private Label hotelName;
    @FXML private Label checkInDate;
    @FXML private Label checkOutDate;
    @FXML private Label locationLabel;
    @FXML private Label roomNum;
    @FXML private Label capacity;
    @FXML private Label userName;
    @FXML private Label totalPrice;
    @FXML private Label refundable;

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
}
