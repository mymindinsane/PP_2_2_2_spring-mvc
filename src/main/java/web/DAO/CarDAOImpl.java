package web.DAO;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDAOImpl implements CarDAO{
    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Audi","A4",2000));
        carList.add(new Car("BMW","M5",2019));
        carList.add(new Car("Ford","Consul",1973));
        carList.add(new Car("Chevrolet","Aveo",2012));
        carList.add(new Car("Jeep","Gladiator",2022));
        carList.add(new Car("Mazda","MX-5",2021));
        carList.add(new Car("Alfa Romeo","GT",2004));
    }
    @Override
    public List<Car> limitCars(int limit) {
        return carList.subList(0,limit);
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }
}
