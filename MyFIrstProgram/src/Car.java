public class Car {
    //Fields
    private int speed;
    private int passengers;
    private String color;
    private String make;
    private static int idNum;
    public int carId;


    //Constructor
    //Special methods
    Car(int speed, int passengers, String color, String make){
        System.out.println("Car Constructed");
        this.speed = speed;
        this.passengers = passengers;
        this.color = color;
        this.make = make;
    }
    Car(String make){
        this.make = make;
    }
    Car(){
        System.out.println("default car constructed");
        speed = 0;
        color = "black";
        passengers = 4;
        make = "unknown";
        carId = this.idNum;
        this.idNum++;
    }
    //Methods
    //setters and getters

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        if(speed < 0){
            this.speed = 0;
        }
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }


    public void speedUp(){
        speed++;
    }
    public void slowDown(){
        speed--;
        if(speed < 0){
            speed = 0;
        }
    }
    public String toString(){
        return "Make: " + make;
    }
}
