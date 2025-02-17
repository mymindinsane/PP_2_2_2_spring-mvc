package web.Service;

import web.Model.Car;

import java.util.List;

public interface CarService {
     List<Car> limitCars(int limit);
     List<Car> getAllCars();
}
