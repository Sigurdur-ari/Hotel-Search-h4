package software.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UserController {

    @FXML private TextField fieldName;
    @FXML private TextField fieldCard;
    @FXML private TextField fieldSSNo;
    @FXML private Button doneButton;

    private String data1, data2, data3;

    @FXML
    private void handleDone() {
        // Check if any field is empty
        if (fieldName.getText().trim().isEmpty() || fieldCard.getText().trim().isEmpty() || fieldSSNo.getText().trim().isEmpty()) {
            // If any field is empty, do nothing
            System.out.println("Please fill all fields.");
            return;
        }

        data1 = fieldName.getText();
        data2 = fieldCard.getText();
        data3 = fieldSSNo.getText();

        System.out.println("Submitted: " + data1 + ", " + data2 + ", " + data3);

        Stage stage = (Stage) doneButton.getScene().getWindow();
        stage.close();
    }

    public String[] getResult() {
        return new String[]{data1, data2, data3};
    }
}

