package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    public TextField textName;
    public TextField textQuantity;
    public TextField textPrice;
    public ListView<Product> listProducts = new ListView<>();
    public Label labelQuantity;
    public Label labelPrice;
    public Label labelName;
    public Button purchaseButton;

    public void createProduct(ActionEvent actionEvent) {
        String name = textName.getText();
        int quantity = Integer.parseInt(textQuantity.getText());
        double price = Double.parseDouble(textPrice.getText());

        Product temp = new Product(name, quantity, price);
        listProducts.getItems().add(temp);
        textName.clear();
        textPrice.clear();
        textQuantity.clear();
        purchaseButton.setDisable(true);
    }

    public void displayProduct(MouseEvent mouseEvent) {
        Product temp = listProducts.getSelectionModel().getSelectedItem();
        labelName.setText(temp.name);
        labelPrice.setText(Double.toString(temp.cost));
        labelQuantity.setText(Integer.toString(temp.quantity));
        purchaseButton.setDisable(false);
    }

    public void purchaseProduct(ActionEvent actionEvent) {
        Product temp = listProducts.getSelectionModel().getSelectedItem();
        temp.purchase();
        labelQuantity.setText(Integer.toString(temp.quantity));

    }
}
