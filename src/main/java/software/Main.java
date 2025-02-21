package software;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage){
        Database db = new Database();

        try {
            ResultSet rs = db.query("SELECT * FROM hotels");
            primaryStage.setTitle("Hotel Search engine");
            StringBuilder testString = new StringBuilder();
            while (rs.next()) {
                testString.append(rs.getString("name"));
            }
            Label testingLabel = new Label(testString.toString());
            Scene scene = new Scene(testingLabel, 800, 600);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.close();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
