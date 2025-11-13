package models;

public class Car {
  private String name;
  private int year;

  public Car(String name, int year) {
    this.name = name;
    this.year = year;
  }

  public String getName() {
    return name;
  }

  public int getYear() {
    return year;
  }

  @Override
  public String toString() {
    return "name=" + name + ", year=" + year + "";
  }

}
