package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "hires")
public class Hire {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idHire;
	
	@NotNull
	@Column
	private String nameHire;
	
	
	public Hire(){
		
	}
	public Hire(long idHire) { 
	    this.idHire = idHire;
	  }

	public Hire(String nameHire) {
	    this.nameHire = nameHire;
	  }
	public long getIdHire() {
		return idHire;
	}
	public void setIdHire(long idHire) {
		this.idHire = idHire;
	}
	public String getNameHire() {
		return nameHire;
	}
	public void setName(String nameHire) {
		this.nameHire = nameHire;
	}
}
