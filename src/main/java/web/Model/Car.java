package web.Model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String producer;
    private String model;
    private int year;

    public Car() {
    }

    public Car(String producer, String model, int year) {
        this.producer = producer;
        this.model = model;
        this.year = year;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static List<Car> carListGen() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Audi", "R8", 2015));
        carList.add(new Car("Audi", "A4", 2019));
        carList.add(new Car("Audi", "A6", 2018));
        carList.add(new Car("Mazda", "RX8", 2008));
        carList.add(new Car("Subaru", "ImprezaWRX", 2005));

        return carList;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
