package application;

import entities.Circle;
import entities.Shape;
import entities.enums.Color;

public class Program {
  public static void main(String[] args) {
    
    Circle c1 = new Circle(Color.BLUE, 0.8, 4);
    Shape s1 = new Circle(Color.GREEN, 1.2, 7);

    System.out.println(c1.getColor());
    System.out.println(((Circle)s1).area());

  }
}
