package com.TNS.user_service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class User_service {
	@Autowired
	private User_service_repository repo;
	public List<User> listAll()
	{
		return repo.findAll();
	}
	public User get(Integer U_id)
	{
		return repo.findById(U_id).get();
	}
	public void delete(Integer U_id)
	{
		repo.deleteById(U_id);
	}
	public void save(User usr)
	{
		repo.save(usr);
	}
}

