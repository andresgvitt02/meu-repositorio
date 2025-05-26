package com.carro.apirest.controllers;

import com.carro.apirest.models.Car;
import com.carro.apirest.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    private CarService carService;
    public CarController(CarService carService){
        this.carService = carService;
    }
    @GetMapping
    public ResponseEntity<List<Car>> getCar() {
        return ResponseEntity.ok(this.carService.getCars());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCar(@PathVariable int id){
        return ResponseEntity.ok(this.carService.getCar(id));
    }

    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody Car car){
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(car.getId()).toUri();

        return ResponseEntity.created(uri).body(this.carService.createCar(car));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Car> updateCar(@RequestBody Car car, @PathVariable int id) {
        Car updatedCar = this.carService.updateCar(car, id);
        return ResponseEntity.ok(updatedCar);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable int id) {
        this.carService.deleteCar(id);
        return ResponseEntity.noContent().build();
    }
}
