package software.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import software.Database;
import software.objects.Hotel;
import software.objects.Search;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class SearchController {

    @FXML private TextField locationField;
    @FXML private DatePicker checkInDateField;
    @FXML private DatePicker checkOutDateField;
    @FXML private ComboBox<Integer> guestSelector;

    @FXML
    private void handleSearch() {
        String location = locationField.getText().trim();
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

            System.out.println(availableHotels);

            System.out.println("Initial search called with values: "
                    + location + " "
                    + formattedCheckIn + " "
                    + formattedCheckOut + " "
                    + guests);

            switchView(availableHotels, search);
        }
    }

    private void switchView(ArrayList<Hotel> availableHotels, Search search){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/HotelView.fxml"));
            Parent root = loader.load();

            HotelViewController hotelViewController = loader.getController();
            hotelViewController.setHotels(availableHotels);
            hotelViewController.setSearch(search);

            Stage stage = (Stage) locationField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
