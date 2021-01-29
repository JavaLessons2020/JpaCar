package org.itstep.controller;


import org.itstep.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {


    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping(value = {"", "car"})
    public String showCars(Model model) {
        model.addAttribute("cars",carService.getAllCars());
        System.out.println(carService.getAllCars());
        return "show_cars";
    }
}
