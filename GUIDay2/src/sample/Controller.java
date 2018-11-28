package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField textName;
    public TextField textQuanitity;
    public TextField textPrice;
    public Label labelName;
    public Label LabelQuantity;
    public Label labelPrice;
    public ListView<Product> productList = new ListView<Product>();

    public void createProduct(ActionEvent actionEvent) {
        String name = textName.getText();
        int quantity = Integer.parseInt(textQuanitity.getText());
        double price = Double.parseDouble(textPrice.getText());
        Product temp = new Product(name, quantity, price);
        productList.getItems().add(temp);
        textPrice.clear();
        textName.clear();
        textQuanitity.clear();
    }

    public void purchase(ActionEvent actionEvent) {
        Product temp = productList.getSelectionModel().getSelectedItem();
        temp.purchase();
        LabelQuantity.setText(Integer.toString(temp.quantity));
    }

    public void selectProduct(MouseEvent mouseEvent) {
        Product temp = productList.getSelectionModel().getSelectedItem();
        labelPrice.setText(Double.toString(temp.price));
        labelName.setText(temp.name);
        LabelQuantity.setText(Integer.toString(temp.quantity));
    }
}
