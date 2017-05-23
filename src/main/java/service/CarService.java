package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Car;
import models.CarDao;

@Service
public class CarService {
	@Autowired
	private CarDao carDao;
	
	public Iterable<Car> getAllCars(){
		return carDao.findAll();
	}
	public Car getCar(long idCar){
		return carDao.findOne(idCar);
	}
	public void addCar(Car car){
		carDao.save(car);
	}
	public void updateCar(Car car){
		carDao.save(car);
	}
	public void deleteCar(long idCar){
		carDao.delete(idCar);
	}
}
