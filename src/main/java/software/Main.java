package software;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage){
        Database db = new Database();
        //bara leið til að sjá það sem er geymt í rooms
        try {
            ResultSet rs1 = db.query("SELECT * FROM hotels");
            primaryStage.setTitle("Hotel Search engine");
            VBox hotelBox = new VBox();
            while (rs1.next()) {
                String hotel = rs1.getString("name");
                VBox roomBox = new VBox();
                String query = String.format("SELECT * FROM hotelRooms WHERE hotelName = '%s'", hotel);
                ResultSet rs2 = db.query(query);
                while (rs2.next()) {
                    String hotelName = rs2.getString("hotelName");
                    String date = rs2.getString("date");
                    int roomNum = rs2.getInt("roomNum");
                    int capacity = rs2.getInt("capacity");
                    int pricePerNight = rs2.getInt("pricePerNight");

                    String labelText = String.format("Hotel: %s, Date: %s, Room Number: %d, Capacity: %d, Price: %d",
                            hotelName, date, roomNum, capacity, pricePerNight);

                    Label label = new Label(labelText);
                    roomBox.getChildren().add(label);
                }
                hotelBox.getChildren().add(roomBox);
                db.closeRS(rs2);
            }
            db.closeRS(rs1);
            Scene scene = new Scene(hotelBox, 800, 600);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            db.close();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
