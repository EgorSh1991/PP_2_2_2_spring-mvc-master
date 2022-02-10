package web.Service;

import web.Model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class ServiceImpl{
    public static List<Car> getCar(List<Car> carList, String count) {
        if (count!=null) {
            int c = Integer.parseInt(count);
            return carList.stream().limit(c).collect(Collectors.toList());
        } else {
            return carList;
        }
    }
}
