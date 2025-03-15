package software.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import software.objects.HotelRoom;
import software.objects.Search;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RoomItemController {
    @FXML private Label roomNum;
    @FXML private Label pricePerNight;
    @FXML private Label totalPriceOfRoom;
    @FXML private Label capacity;
    @FXML private Label refundable;
    @FXML private Button bookButton;

    private HotelRoom hRoom;


    //setur data á roomItem hlut til að fylla listview.
    public void setRoomData(HotelRoom room, Search search){
        this.hRoom = room;
        roomNum.setText("Room number: " + room.getRoomNumber());
        pricePerNight.setText("Price per night: " + String.format("%,d", room.getPricePerNight()) + " kr");

        LocalDate start = LocalDate.parse(search.getCheckInDate());
        LocalDate end = LocalDate.parse(search.getCheckOutDate());
        long dayDiff = ChronoUnit.DAYS.between(start, end);
        int totalPrice = (int) dayDiff * room.getPricePerNight();

        totalPriceOfRoom.setText("Total price of stay: " + String.format("%,d", totalPrice) + " kr");

        capacity.setText("Capacity of room: " + room.getCapacity());
        refundable.setText(room.isRefundable() ? "💰 Refundable" : "Non refundable");
    }
}


