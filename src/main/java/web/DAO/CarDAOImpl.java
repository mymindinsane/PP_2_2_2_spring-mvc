package web.DAO;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDAOImpl implements CarDAO{
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car());
        carList.add(new Car());
        carList.add(new Car());
        carList.add(new Car());
        carList.add(new Car());
        carList.add(new Car());
    }
    @Override
    public List<Car> limitCars(int limit) {
        return carList.subList(0,limit);
    }
}
