package software.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import software.objects.Hotel;

public class HotelItemController {
    @FXML
    private ImageView hotelImage;
    @FXML private Label hotelName;
    @FXML private Label checkInTime;
    @FXML private Label checkOutTime;
    @FXML private Label hotelRating;
    @FXML private Label ratingCount;
    @FXML private Label accessible;
    @FXML private Label petsAllowed;
    @FXML private Label refundable;

    public void setHotelData(Hotel hotel) {
        hotelName.setText(hotel.getName());
        checkInTime.setText(hotel.getCheckInTime());
        checkOutTime.setText(hotel.getCheckOutTime());
        hotelRating.setText("★ " + hotel.getRating());
        ratingCount.setText("(" + hotel.getRatingCount() + " reviews)");

        accessible.setText(hotel.isAccessible() ? "♿ Accessible" : "");
        petsAllowed.setText(hotel.isPetsAllowed() ? "🐶 Pets Allowed" : "");
        refundable.setText(hotel.isRefundable() ? "💰 Refundable" : "");

        String photoURL = hotel.getPhotoURL();
        if (photoURL != null && !photoURL.isEmpty()) {
            hotelImage.setImage(new Image(photoURL));
        } else{
            System.out.println("No image found");
        }
    }
}
