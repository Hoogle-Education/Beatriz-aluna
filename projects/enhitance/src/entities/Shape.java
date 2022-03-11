package entities;

import entities.enums.Color;

public class Shape {

  private Color color;
  private double espessura;

  public Shape(Color color, double espessura2) {
    this.color = color;
    this.espessura = espessura2;
  }

  public Color getColor() {
    return color;
  }
  public void setColor(Color color) {
    this.color = color;
  }
  public double getEspessura() {
    return espessura;
  }
  public void setEspessura(int espessura) {
    this.espessura = espessura;
  }

}
