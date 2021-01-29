package org.itstep.service;

import org.itstep.model.Car;
import org.itstep.repository.CarJPA;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private  final  CarJPA carJPA;

    public CarService(CarJPA carJPA) {
        this.carJPA = carJPA;
    }

    public List<Car> getAllCars(){
        return carJPA.findAll();
    }


}
