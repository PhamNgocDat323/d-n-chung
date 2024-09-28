package java_27_9;

public class Car {
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYearCreated() {
        return yearCreated;
    }
    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    private  String brand;
    private  String model;
    private  int yearCreated;
    private  int price;
    public Car(String brand, String model, int year, int price) {
        this.brand = brand;
        this.model = model;
        this.yearCreated = year;
        this.price = price;
    }
    public void calculateDepreciation(int currentYear){
        int yearUsed = currentYear - yearCreated;
        double depreciationRate = 0.05;
        double depreciationPrice = price;

        for(int i = 0 ;i< yearUsed ;i++){
            depreciationPrice *= (1 - depreciationRate);
        }

        System.out.println("Depreciated price after " + yearUsed + " years: " + depreciationPrice);
    }

    public  void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2010, 2000000);
        car.calculateDepreciation(2020);
    }
}
