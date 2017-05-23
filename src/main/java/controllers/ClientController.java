package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import models.Client;
import service.ClientService;

@RestController
public class ClientController {
	@Autowired
	private ClientService clientService;
	
	/*
	  GET /get-by-all --> Return the all  the clients.
	  @return 
	 */
		@RequestMapping("/clients")
	public Iterable<Client> getAllClients(){
		return clientService.getAllClients();
	}
	/*
	  GET /get-by-id --> Return the id for the client having the passed id.
	  @return 
	 */
	@RequestMapping("/clients/{id}")
	public Client getClient(@PathVariable long id){
		return clientService.getClient(id);
	}
	/*
	    GET /create  --> Create a new client and save it in the database.
	*/  
	@RequestMapping(method=RequestMethod.POST, value= "client/create")
	public void addClient(@RequestBody Client client){
		clientService.addClient(client);
	}

	/*
	  GET /update --> Update the client in the
	  database having the passed id.
	 */
	@RequestMapping(method=RequestMethod.PUT, value= "client/update")
	public void updateClient(@RequestBody Client client){
		clientService.updateClient(client);
	}
	/*
	  GET /delete --> Delete the client having the passed id.
	*/
	@RequestMapping(method=RequestMethod.DELETE, value= "client/delete")
	public void deleteClient(@PathVariable long id ){
		clientService.deleteClient(id);
	}
}
