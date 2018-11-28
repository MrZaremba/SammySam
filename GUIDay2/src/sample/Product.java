package sample;

public class Product {
    String name;
    int quantity;
    double price;

    Product(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void purchase(){
        if(quantity > 0){
            quantity--;
        }
    }
    public String toString(){
        return "Name: " + name;
    }
}
