package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import models.Car;
import service.CarService;

@RestController
public class CarController {
	@Autowired
	private CarService carService;
	/*
	  GET /get-by-all --> Return the all  the cars.
	  @return 
	 */
	@RequestMapping("/cars")
	public Iterable<Car> getAllCars(){
		return carService.getAllCars();
	}
	/*
	  GET /get-by-id --> Return the id for the car having the passed id.
	  @return 
	 */
	@RequestMapping("/car/{id}")
	public Car getCar(@PathVariable long idCar){
		return carService.getCar(idCar);
	}
	/*
    GET /create  --> Create a new car and save it in the database.
	*/  
	@RequestMapping(method=RequestMethod.POST, value= "car/create")
	public void addCar(@RequestBody Car car){
		carService.addCar(car);
	}
	/*
	  GET /update --> Update the car  in the
	  database having the passed id.
	 */
	@RequestMapping(method=RequestMethod.PUT, value= "car/update")
	public void updateCar(@RequestBody Car car){
		carService.updateCar(car);
	}
	/*
	  GET /delete --> Delete the car having the passed id.
	*/
	@RequestMapping(method=RequestMethod.DELETE, value= "car/delete")
	public void deleteCar(@PathVariable long idCar){
		carService.deleteCar(idCar);
	}
}

