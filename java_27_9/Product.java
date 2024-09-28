package java_27_9;

public class Product {
    private  String name;
    private  int price;
    private  float quantity;
    public Product(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void calculateTotalPrice(){
        System.out.println("Total price: " + price * quantity);
    }
    public void displayInformation(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
//    public  void main(String[] args) {
//        Product p1 = new Product("pen",1000,100);
//        p1.calculateTotalPrice();
//    }
}
