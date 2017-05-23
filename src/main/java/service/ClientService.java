package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Client;
import models.ClientDao;

@Service
public class ClientService {
	
	@Autowired
	private ClientDao clientDao;
	
	public Iterable<Client> getAllClients(){
		return clientDao.findAll();
	}
	public Client getClient(long id){
		return clientDao.findOne(id);
	}
	public void addClient(Client client){
		clientDao.save(client);
	}
	public void updateClient(Client client){
		clientDao.save(client);
	}
	public void deleteClient(long id){
		clientDao.delete(id);
	}
}
