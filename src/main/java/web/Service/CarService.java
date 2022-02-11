package web.Service;

import web.Model.Car;

import java.util.List;

public interface CarService {
    List<Car> addCar();
    List<Car> getCar(List<Car> carList, String count);
}
