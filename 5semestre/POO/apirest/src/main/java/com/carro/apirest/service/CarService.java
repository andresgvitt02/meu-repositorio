package com.carro.apirest.service;

import com.carro.apirest.entities.Car;
import com.carro.apirest.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CarService {
    private CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;

    }

    public Car getCar(Long id){
        return this.carRepository.findById(id).orElseThrow();
    }

    public List<Car> getCars(){
        return this.carRepository.findAll();
    }

    public Car createCar(Car car){
        return this.carRepository.save(car);
    }
    public void deleteCar(Long id){
        Car car = this.carRepository.findById(id).orElseThrow();
        this.carRepository.delete(car);
    }

//    public Car updateCar(Car carRequest, Long id){
//        return this.carRepository.updateCar(carRequest, id);
//    }
}
