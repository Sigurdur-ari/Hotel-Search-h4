package software.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import software.Database;
import software.objects.Booking;
import software.objects.Hotel;
import software.objects.Search;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class SearchController {

    @FXML private ComboBox<String> locationField;
    @FXML private DatePicker checkInDateField;
    @FXML private DatePicker checkOutDateField;
    @FXML private ComboBox<Integer> guestSelector;
    @FXML private Label errorMessage;

    //Handler fyrir initial search, býr til glænýjann search hlut og leitar að hótelum sem passa.
    @FXML
    private void handleSearch() {
        String location = locationField.getValue();
        LocalDate checkInDate = checkInDateField.getValue();
        LocalDate checkOutDate = checkOutDateField.getValue();
        Integer guests = guestSelector.getValue();

        if (!location.isEmpty() && checkInDate != null && checkOutDate != null) {
            Database db = new Database();
            Search search = new Search(db.getHotels());

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedCheckIn = checkInDate.format(formatter);
            String formattedCheckOut = checkOutDate.format(formatter);

            ArrayList<Hotel> availableHotels = search.initialSearch(location, formattedCheckIn, formattedCheckOut, guests);

            if(availableHotels.isEmpty()){
                errorMessage.setText("No hotels matched this search!");
                return;
            }

            long daysBetween = ChronoUnit.DAYS.between(checkInDate, checkOutDate);

            if(daysBetween < 1){
                errorMessage.setText("Stay has to be at least 1 day!");
                return;
            }

            switchToHotelView(availableHotels, search);
        }
    }

    //Skiptir yfir í hotelView og tengir við controller til að frumstilla.
    private void switchToHotelView(ArrayList<Hotel> availableHotels, Search search){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/HotelView.fxml"));
            Parent root = loader.load();

            HotelViewController hotelViewController = loader.getController();
            hotelViewController.setSearch(search);
            hotelViewController.setHotels(availableHotels);

            //random hlutur valinn til að fá window.
            Stage stage = (Stage) locationField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void handleViewBookings(ActionEvent actionEvent) {
        Database db = new Database();
        ArrayList<Booking> bookings = db.getAllBookings();
        switchToBookingView(bookings);
    }

    private void switchToBookingView(ArrayList<Booking> bookings){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/BookingView.fxml"));
            Parent root = loader.load();

            BookingViewController bookingViewController = loader.getController();
            bookingViewController.setBookings(bookings);

            //random hlutur valinn til að fá window.
            Stage stage = (Stage) locationField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
