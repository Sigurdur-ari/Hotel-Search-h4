package software.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import software.objects.Hotel;
import software.objects.Search;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HotelItemController {
    @FXML public Label priceLabel;
    @FXML private ImageView hotelImage;
    @FXML private Label hotelName;
    @FXML private Label checkInTime;
    @FXML private Label checkOutTime;
    @FXML private Label hotelRating;
    @FXML private Label ratingCount;
    @FXML private Label accessible;
    @FXML private Label petsAllowed;
    @FXML private Label refundable;

    public void setHotelData(Hotel hotel, Search search) {
        hotelName.setText(hotel.getName());
        checkInTime.setText(hotel.getCheckInTime());
        checkOutTime.setText(hotel.getCheckOutTime());
        hotelRating.setText("★ " + hotel.getRating());
        ratingCount.setText("(" + hotel.getRatingCount() + " reviews)");

        int cheapestRoom = hotel.getCheapestRoom();
        //System.out.println("cheapestroom" + cheapestRoom);
        LocalDate start = LocalDate.parse(search.getCheckInDate());
        //System.out.println("startday" + start);
        LocalDate end = LocalDate.parse(search.getCheckOutDate());
        //System.out.println("endday" + end);
        long dayDiff = ChronoUnit.DAYS.between(start, end);
        //System.out.println("daydiff" + dayDiff);
        int totalPrice = (int) dayDiff * cheapestRoom;
        //System.out.println("total" + totalPrice);

        priceLabel.setText(String.format("%,d", totalPrice) + " kr");

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
