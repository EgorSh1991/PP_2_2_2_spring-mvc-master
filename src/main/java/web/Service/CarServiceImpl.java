package web.Service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> carsList = List.of(
            new Car("Audi", "R8", 2015),
            new Car("Audi", "A4", 2019),
            new Car("Audi", "A6", 2018),
            new Car("Mazda", "RX8", 2008),
            new Car("Subaru", "ImprezaWRX", 2005),
            new Car("Model_Name1", "1", 2008),
            new Car("Model_Name2", "2", 2005),
            new Car("Model_Name3", "3", 2008),
            new Car("Model_Name4", "4", 2005)
    );

    public List<Car> getCar(int count) {
        if (count == 0 || count >= 5) {
            return carsList;
        }
        if (count > 0) {
            return carsList.stream().limit(count).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }
}
