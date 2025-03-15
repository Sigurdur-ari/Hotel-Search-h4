package software.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.controlsfx.control.RangeSlider;
import software.objects.Hotel;
import software.objects.Search;

import java.io.IOException;
import java.util.ArrayList;

public class HotelViewController {
    @FXML
    public Label minPriceLab;
    @FXML
    public Label maxPriceLab;
    @FXML
    private VBox filterBox;

    @FXML
    private ListView<HBox> hotelListView;
    private Search search;

    public void initialize() {
        RangeSlider priceSlider = new RangeSlider(0, 50000, 0, 50000); //RangeSlider (min price:, max price:, initial range: n, m)
        priceSlider.setShowTickMarks(true);
        priceSlider.setShowTickLabels(true);
        priceSlider.setMajorTickUnit(10000);
        priceSlider.setBlockIncrement(5000);
        priceSlider.setSnapToTicks(true);

        filterBox.getChildren().add(priceSlider);

        priceSlider.lowValueProperty().addListener((obs, oldVal, newVal) -> {
            minPriceLab.setText(Integer.toString(newVal.intValue()));
        });

        priceSlider.highValueProperty().addListener((obs, oldVal, newVal) -> {
            maxPriceLab.setText(Integer.toString(newVal.intValue()));
        });
    }

    public void setHotels(ArrayList<Hotel> availableHotels){
        hotelListView.getItems().clear();
        for (Hotel hotel : availableHotels) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/HotelItem.fxml"));
                Parent hotelItem = loader.load();

                // Get the controller for the item
                HotelItemController controller = loader.getController();
                controller.setHotelData(hotel, search);

                // Add item to ListView
                hotelListView.getItems().add((HBox)hotelItem);

            } catch (IOException e) {
                System.err.println("Error loading FXML: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public void setSearch(Search search){
        this.search = search;
    }

}
