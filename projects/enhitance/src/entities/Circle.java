package entities;

import entities.enums.Color;

public class Circle extends Shape {
  
  private static final double PI = 3.14159267;
  private double radius;
  
  public Circle(Color color, double espessura, double radius) {
    super(color, espessura);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
 
  public double perimeter(){
    return 2*PI*radius;
  }

  public double area(){
    return PI*radius*radius;
  }

}
