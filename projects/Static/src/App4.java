class Circle {

    public static final double PI = 3.14159267;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public static double calculateArea(double radius){
        return radius*radius*PI;
    }
    
}

public class App4 {
    public static void main(String[] args) {

        System.out.println(Circle.PI);
        System.out.println(Circle.calculateArea(2.0));

    }
}
