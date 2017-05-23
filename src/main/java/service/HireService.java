package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Hire;
import models.HireDao;

@Service
public class HireService {
	@Autowired
	private HireDao hireDao;
	
	public Iterable<Hire> getAllHires(){
		return hireDao.findAll();
	}
	public Hire getHire(long idHire){
		return hireDao.findOne(idHire);
	}
	public void addHire(Hire hire){
		hireDao.save(hire);
	}
	public void updateHire(Hire hire){
		hireDao.save(hire);
	}
	public void deleteHire(long idHire){
		hireDao.delete(idHire);
	}
}
