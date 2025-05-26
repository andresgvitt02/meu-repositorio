package com.carro.apirest.repositories;

import com.carro.apirest.models.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class CarRepository {
    private List<Car> lista = new ArrayList<>();

    public CarRepository(){
        lista.add(new Car(1, "BMW", "M3", 2020));
        lista.add(new Car(2, "Hyundai", "Sonata", 2015));
        lista.add(new Car(3, "Honda", "City", 2019));
    }

    public List<Car> getCars(){
        return lista;

    }
    public Car getCar(int id) {
        return lista
                .stream()
                .filter(item -> Objects.equals(item.getId(), id))
                .findFirst()
                .orElseThrow();
    }

    public Car createUser(Car car) {
        lista.add(car);
        return car;
    }

    public void deleteUser(int id) {
        Car car = lista
                .stream()
                .filter(item -> Objects.equals(item.getId(), id))
                .findFirst()
                .orElseThrow();

        lista.remove(car);
    }

    public Car updateCar(Car carRequest, int id) {
        Car carFiltrado = lista.stream()
                .filter(item -> Objects.equals(item.getId(), id))
                .findFirst()
                .orElseThrow();

        lista.remove(carFiltrado);

        carRequest.setId(carFiltrado.getId());
        lista.add(carRequest);

        return carRequest;
    }


}
