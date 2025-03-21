package software.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.controlsfx.control.RangeSlider;
import software.objects.Hotel;
import software.objects.Search;

import java.io.IOException;
import java.util.ArrayList;

public class HotelViewController {
    @FXML private Label minPriceLab;
    @FXML private Label maxPriceLab;
    @FXML private VBox priceSliderBox;
    @FXML private VBox ratingSliderBox;
    @FXML private Label minRatingLab;
    @FXML private Label maxRatingLab;
    @FXML private CheckBox petsCheckbox;
    @FXML private CheckBox accessibleCheckbox;
    @FXML private CheckBox refundableCheckbox;

    @FXML private ListView<HBox> hotelListView;
    private Search search;

    //Setur upp double slidera
    public void initialize() {
        RangeSlider priceSlider = new RangeSlider(0, 100000, 0, 100000); //RangeSlider (min price:, max price:, initial range: n, m)
        priceSlider.setShowTickMarks(true);
        priceSlider.setShowTickLabels(true);
        priceSlider.setMajorTickUnit(10000);
        priceSlider.setBlockIncrement(5000);
        priceSlider.setSnapToTicks(true);

        RangeSlider ratingSlider = new RangeSlider(0, 10, 0, 10); //RangeSlider (min rating:, max rating:, initial range: n, m)
        ratingSlider.setShowTickMarks(true);
        ratingSlider.setShowTickLabels(true);
        ratingSlider.setMajorTickUnit(1);
        ratingSlider.setBlockIncrement(0.5);
        ratingSlider.setSnapToTicks(true);

        priceSliderBox.getChildren().add(priceSlider);
        ratingSliderBox.getChildren().add(ratingSlider);

        //Double-headed slider for max and min price for filtering
        priceSlider.setOnMouseReleased(event -> {
            minPriceLab.setText(Integer.toString((int) priceSlider.getLowValue()));
            maxPriceLab.setText(Integer.toString((int) priceSlider.getHighValue()));

            search.updatePrice((int)priceSlider.getLowValue(), (int)priceSlider.getHighValue());
            ArrayList<Hotel> availableHotels = search.searchAgain();
            setHotels(availableHotels);
        });

        //Double-headed slider for max and min rating for filtering
        ratingSlider.setOnMouseReleased(event -> {
            minRatingLab.setText(Integer.toString((int) ratingSlider.getLowValue()));
            maxRatingLab.setText(Integer.toString((int) ratingSlider.getHighValue()));

            search.updateRating((int)ratingSlider.getLowValue(), (int)ratingSlider.getHighValue());
            ArrayList<Hotel> availableHotels = search.searchAgain();
            setHotels(availableHotels);
        });

    }

    //tengir við hotelItem og fyllir listview.
    public void setHotels(ArrayList<Hotel> availableHotels){
        hotelListView.getItems().clear();
        for (Hotel hotel : availableHotels) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/HotelItem.fxml"));
                Parent hotelItem = loader.load();

                // Get the controller for the item
                HotelItemController controller = loader.getController();
                // Set the data for the hotel
                controller.setHotelData(hotel, search);

                // Add item to ListView
                hotelListView.getItems().add((HBox)hotelItem);

            } catch (IOException e) {
                System.err.println("Error loading FXML: " + e.getMessage());
            }
        }
    }

    public void setSearch(Search search){
        this.search = search;
    }


    //handlerar fyrir boolean filtera.

    public void handlePetsFilter(ActionEvent actionEvent) {
        search.updatePets(petsCheckbox.isSelected());
        ArrayList<Hotel> availableHotels = search.searchAgain();
        setHotels(availableHotels);
    }

    public void handleAccessibleFilter(ActionEvent actionEvent) {
        search.updateAccessibility(accessibleCheckbox.isSelected());
        ArrayList<Hotel> availableHotels = search.searchAgain();
        setHotels(availableHotels);
    }

    public void handleRefundableFilter(ActionEvent actionEvent) {
        search.updateRefundable(refundableCheckbox.isSelected());
        ArrayList<Hotel> availableHotels = search.searchAgain();
        setHotels(availableHotels);
    }

    public void handleBack() {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/SearchView.fxml"));
            Parent root = loader.load();
            //random hlutur valinn til að fá window.
            Stage stage = (Stage) minPriceLab.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
