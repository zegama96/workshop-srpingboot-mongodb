package com.zegama.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zegama.workshopmongo.domain.User;
import com.zegama.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	//instanciar automaticamente no serviço
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	

}
