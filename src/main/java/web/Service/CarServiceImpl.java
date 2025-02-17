package web.Service;

import web.DAO.CarDAO;
import web.DAO.CarDAOImpl;
import web.Model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{
    private final CarDAO carDAO = new CarDAOImpl();

    public List<Car> limitCars(int limit) {
        return carDAO.limitCars(limit);
    }
}
