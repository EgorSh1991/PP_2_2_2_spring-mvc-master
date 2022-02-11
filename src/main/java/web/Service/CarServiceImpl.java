package web.Service;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    public List<Car> addCar() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Audi", "R8", 2015));
        carList.add(new Car("Audi", "A4", 2019));
        carList.add(new Car("Audi", "A6", 2018));
        carList.add(new Car("Mazda", "RX8", 2008));
        carList.add(new Car("Subaru", "ImprezaWRX", 2005));

        return carList;
    }
    public List<Car> getCar(List<Car> carList, String count) {
        if (count!=null) {
            int c = Integer.parseInt(count);
            return carList.stream().limit(c).collect(Collectors.toList());
        } else {
            return carList;
        }
    }
}
