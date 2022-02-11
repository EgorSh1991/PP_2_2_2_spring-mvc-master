package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import web.Service.CarService;


@Controller
public class CarController {
    @Autowired
    private final CarService service = null;

    @GetMapping("/cars")
    public String getCar(@RequestParam(name = "count", defaultValue = "0") int count, Model model) {
        model.addAttribute("cars", service.getCar(count));
        return "/cars";
    }

}
