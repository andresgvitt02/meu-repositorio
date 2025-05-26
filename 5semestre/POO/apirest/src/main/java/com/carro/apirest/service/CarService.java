package com.carro.apirest.service;

import com.carro.apirest.models.Car;
import com.carro.apirest.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CarService {
    private CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;

    }

    public Car getCar(int id){
        return this.carRepository.getCar(id);
    }

    public List<Car> getCars(){
        return this.carRepository.getCars();
    }

    public Car createCar(Car car){
        return this.carRepository.createUser(car);
    }
    public void deleteCar(int id){
        this.carRepository.deleteUser(id);
    }

    public Car updateCar(Car carRequest, int id){
        return this.carRepository.updateCar(carRequest, id);
    }
}
