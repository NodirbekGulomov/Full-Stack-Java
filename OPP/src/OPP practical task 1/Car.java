public class Car {
    String model;
    String color;
    double price;
    boolean automatic;

    public Car(String model, String color, double price, boolean automatic) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.automatic = automatic;
    }

    public static void main(String[] args) {
        Car audi = new Car("AUDI", "White", 79_999.99d, true);
        audi.getModel();
        audi.getColor();
        audi.getPrice();
        audi.isAutomatic();
        Car bmw = new Car("BMW", "Black", 79_999.99d, false);
        bmw.getModel();
        bmw.getColor();
        bmw.getPrice();
        bmw.isAutomatic();
    }

    public void getModel() {
        System.out.println("Model " + model);
    }

    public void getColor() {
        System.out.println("Color " + color);
    }

    public void getPrice() {
        System.out.println("Price " + price);
    }

    public void isAutomatic() {
        System.out.println("Is Automatic " + automatic);
    }
}
