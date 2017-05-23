package models;

import org.springframework.data.repository.CrudRepository;

public interface ClientDao extends CrudRepository<Client, Long> {
	/*
	 search clients for the id.
	*/
  public Client findById(long id); 
 
}