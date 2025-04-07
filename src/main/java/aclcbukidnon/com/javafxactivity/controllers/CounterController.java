package aclcbukidnon.com.javafxactivity.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CounterController {

    @FXML
    private Label labelCount;

    // This will be called when the button is clicked
    @FXML
    protected void onPlusClick() {
        String countText = labelCount.getText();
        int countValue = Integer.parseInt(countText);
        countValue++;
        labelCount.setText(String.valueOf(countValue));
    }

    public void onMinusClick(ActionEvent actionEvent) {
    }
}
