package java_27_9;

public class Computer {
    private  String brand;
    private  String model;
    private  int price;
    public Computer(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    // Hàm hiển thị thông tin của máy tính

    public void displayInformation(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Computer myComputer = new Computer("Dell","XpS 15",1500);
        myComputer.displayInformation();
    }
}
