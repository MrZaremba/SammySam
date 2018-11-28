package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label lblNumber;
    public Label LabelName;
    public TextField textGetName;
    int num = 0;

    public void addOne(ActionEvent actionEvent) {
        num++;
        lblNumber.setText(Integer.toString(num));
    }

    public void getName(ActionEvent actionEvent) {
        LabelName.setText(textGetName.getText());
        textGetName.clear();
    }
}
