package sample;

public class Product {
    public String name;
    public int quantity;
    public double cost;

    Product(String name, int quantity, double cost){
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

    public String toString(){
        return name;
    }

    public void purchase(){
        if(quantity > 0){
            quantity--;
        }
    }


}
