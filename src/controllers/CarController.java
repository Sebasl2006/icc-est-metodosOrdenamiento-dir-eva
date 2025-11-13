package controllers;

import models.Car;

public class CarController {

  public void sortByName(Car[] cars) {
    for (int i = 0; i < cars.length - 1; i++) {
      int indmax = i;
      for (int j = i + 1; j < cars.length; j++) {
        if (cars[j].getName().compareToIgnoreCase(cars[indmax].getName()) < 0) {
          indmax = j;
        }

      }
      if (i != indmax) {
        Car aux = cars[i];
        cars[i] = cars[indmax];
        cars[indmax] = aux;
      }

    }

  }

}
