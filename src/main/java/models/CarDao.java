package models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CarDao extends CrudRepository<Car, Long> {
	/*
	 search cars for the id.
	*/
  public Car findByIdCar(long idCar); 
 
}