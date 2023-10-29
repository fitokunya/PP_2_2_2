package web.Dao;

import org.springframework.stereotype.Component;
import web.Model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> listCars(Integer count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Vedro s boltami", "WHITE", 4));
        carList.add(new Car("BMW", "BLACK", 2));
        carList.add(new Car("Audi", "RED", 2));
        carList.add(new Car("Bugatti", "CIAN", 2));
        carList.add(new Car("Ford", "LIGHTBLUE", 3));

        return carList.stream().limit(count).toList();
    }
}
