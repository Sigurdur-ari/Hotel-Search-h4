package software.ui;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import software.Database;
import software.objects.Hotel;
import software.objects.Search;

import java.util.ArrayList;

public class SearchController {

    @FXML private TextField locationField;
    @FXML private TextField checkInDateField;
    @FXML private TextField checkOutDateField;
    @FXML private ComboBox<Integer> guestSelector;

    @FXML
    private void handleSearch() {
        String location = locationField.getText().trim();
        String checkInDate = checkInDateField.getText().trim();
        String checkOutDate = checkOutDateField.getText().trim();
        Integer guests = guestSelector.getValue();

        if (!location.isEmpty() && !checkInDate.isEmpty() && !checkOutDate.isEmpty()) {
            Database db = new Database();
            Search search = new Search(db.getHotels());
            ArrayList<Hotel> availableHotels = search.initialSearch(location, checkInDate, checkOutDate, guests);

            System.out.println(availableHotels);

            System.out.println("Initial search called with values: "
                    + location + " "
                    + checkInDate + " "
                    + checkOutDate + " "
                    + guests);
        }
    }
}
