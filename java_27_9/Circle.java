package java_27_9;

public class Circle {
    private static double radious;
    public void CalculateArea(){
        double area = Math.PI * radious * radious;;
        System.out.println("Area: " + area);
    }
    public void CalculatePerimeter(){
        double perimeter = 2 * Math.PI * radious;
        System.out.println("Perimeter: " + perimeter);
    }
    public Circle(double radious) {
        Circle.radious = radious;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(34);
        circle.CalculateArea();
        circle.CalculatePerimeter();
    }
}
