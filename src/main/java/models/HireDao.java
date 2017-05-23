package models;

import org.springframework.data.repository.CrudRepository;

public interface HireDao extends CrudRepository<Hire, Long> {
	/*
	 search rent company for the id.
	*/
  public Hire findByIdHire(long idHire); 
}