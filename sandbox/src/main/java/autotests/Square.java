package autotests;

public class Square {

  public double l;

  //конструктор

  public Square(double len) {
    this.l = len;
  }

  public double area() {
    return this.l * this.l;
  }
}
