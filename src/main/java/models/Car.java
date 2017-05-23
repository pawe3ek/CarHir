package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cars")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCar;
	@NotNull
	private String markCar;
	@NotNull
	private String modelCar;
	
	// Public methods
	
	public Car() { 
		
	}
	public Car(long idCar) { 
	    this.idCar = idCar;
	}
	public Car(String markCar, String modelCar) {
	    this.markCar = markCar;
	    this.modelCar = modelCar;
	}
	
	public long getIdCar() {
		return idCar;
	}

	public void setIdCar(long idCar) {
		this.idCar = idCar;
	}

	public String getMarkCar() {
		return markCar;
	}

	public void setMarkCar(String markCar) {
		this.markCar = markCar;
	}

	public String getModelCar() {
		return modelCar;
	}

	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}
}
