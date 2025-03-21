package software.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import software.Database;
import software.objects.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RoomItemController {
    @FXML private Label roomNum;
    @FXML private Label pricePerNight;
    @FXML private Label totalPriceOfRoom;
    @FXML private Label capacity;
    @FXML private Label refundable;
    @FXML private Button bookButton;

    private Search search;
    private Hotel hotel;
    private HotelRoom hotelRoom;
    private int totalPrice;


    //setur data á roomItem hlut til að fylla listview.
    public void setRoomData(Hotel hotel, HotelRoom room, Search search){
        this.hotelRoom = room;
        this.hotel = hotel;
        this.search = search;
        roomNum.setText("Room number: " + room.getRoomNumber());
        pricePerNight.setText("Price per night: " + String.format("%,d", room.getPricePerNight()) + " kr");

        LocalDate start = LocalDate.parse(search.getCheckInDate());
        LocalDate end = LocalDate.parse(search.getCheckOutDate());
        long dayDiff = ChronoUnit.DAYS.between(start, end);
        int totalPrice = (int) dayDiff * room.getPricePerNight();
        this.totalPrice = totalPrice;

        totalPriceOfRoom.setText("Total price of stay: " + String.format("%,d", totalPrice) + " kr");

        capacity.setText("Capacity of room: " + room.getCapacity());
        refundable.setText(room.isRefundable() ? "💰 Refundable" : "Non refundable");
    }

    public void handleBooking(ActionEvent actionEvent) {
        try {
            Database db = new Database();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/UserView.fxml"));
            Parent root = loader.load();

            UserController controller = loader.getController();

            Stage popupStage = new Stage();
            popupStage.initModality(Modality.APPLICATION_MODAL);
            popupStage.setTitle("Submit User Data");
            popupStage.setScene(new Scene(root));
            popupStage.showAndWait();

            String[] result = controller.getResult();
            if (result[0] == null || result[1] == null || result[2] == null) {
                System.out.println("Some Fields were null");
                return;
            }
            User user = new User(result[0], result[1], result[2]);
            Booking booking = new Booking(hotel.getName(), user.getUserName(), hotelRoom.getRoomNumber(), totalPrice, search.getCheckInDate(), search.getCheckOutDate(), hotelRoom.getCapacity(), hotel.getLocation(), hotelRoom.isRefundable());
            System.out.println("creating new booking with: " + hotel.getName() + user.getUserName() + hotelRoom.getRoomNumber() + totalPrice + search.getCheckInDate() + search.getCheckOutDate() + hotelRoom.getCapacity() + hotel.getLocation() + hotelRoom.isRefundable());
            db.makeBooking(booking);

            loader = new FXMLLoader(getClass().getResource("/ui/ConfirmationView.fxml"));
            root = loader.load();

            ConfirmationController confirmationController = loader.getController();
            confirmationController.setBooking(booking);

            //random hlutur valinn til að fá window.
            Stage stage = (Stage) bookButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


