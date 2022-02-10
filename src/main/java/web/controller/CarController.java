package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.ServiceImpl;

import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String getCar(@RequestParam(required = false) String count, Model model) {
        List<Car> cars;
        cars = ServiceImpl.getCar(Car.carListGen(), count);
        model.addAttribute("cars", cars);
        return "/cars";
    }

}
