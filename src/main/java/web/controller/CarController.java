package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.Service.CarServiceImpl;

@Controller
public class CarController {
    CarService carService = new CarServiceImpl();
    @GetMapping("/cars")
    public String listCars(@RequestParam(required = false) Integer count, Model model) {
        if (count == null || count >= 5){
            model.addAttribute("carsList",carService.getAllCars());
        } else {
            model.addAttribute("carsList",carService.limitCars(count));
        }
        return "cars.html";

    }
}
