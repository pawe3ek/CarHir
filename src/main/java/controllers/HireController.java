package controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import models.Hire;
import service.HireService;

@RestController
public class HireController {
	@Autowired
	private HireService hireService;
	/*
	  GET /get-by-all --> Return the all  the rent company (hire).
	  @return 
	 */
	@RequestMapping("hires")
	public Iterable<Hire> getAllHires(){
		return hireService.getAllHires();
	}
	/*
	  GET /get-by-id --> Return the id for the rent company having the passed id.
	  @return 
	 */
	@RequestMapping("/hire/{id}")
	public Hire getHire(@PathVariable long idHire){
		return hireService.getHire(idHire);
	}
	/*
    GET /create  --> Create a new rent company and save it in the database.
	 */
	@RequestMapping(method=RequestMethod.POST, value= "hire/create")
	public void addHire(@RequestBody Hire hire){
		hireService.addHire(hire);
	}
	/*
	  GET /update --> Update the rent company in the
	  database having the passed id.
	 */
	@RequestMapping(method=RequestMethod.PUT, value= "hire/update")
	public void updateHire(@RequestBody Hire hire){
		hireService.updateHire(hire);
	}
	/*
	  GET /delete --> Delete the rent company having the passed id.
	*/
	@RequestMapping(method=RequestMethod.DELETE, value= "hire/delete")
	public void deleteHire(@PathVariable long idHire){
		hireService.deleteHire(idHire);
	}
}

