package com.TNS.user_service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class User_service_controller
{
	@Autowired
	private User_service us;
	@GetMapping("/User_service")
	public List<User> list()
	{
		return us.listAll();
	}
	@GetMapping("/User_service/(U_id)")
	public ResponseEntity<User> get(@PathVariable Integer U_id)
	{
		try
		{
			User usr=us.get(U_id);
			return new ResponseEntity<User>(usr,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/User_service")
	public void add(@RequestBody User ur)
	{
		us.save(ur);
	}
	@PutMapping("/User_service/{U_id}")
	public ResponseEntity<?> update(@RequestBody User ur,@PathVariable Integer U_id)
	{
		User existuser=us.get(U_id);
		us.save(existuser);
		return new ResponseEntity<>(HttpStatus.OK);		
	}
	public void delete(@PathVariable Integer U_id)
	{
		us.delete(U_id);
	}
	
}


