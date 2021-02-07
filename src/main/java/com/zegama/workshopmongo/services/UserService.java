package com.zegama.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zegama.workshopmongo.domain.User;
import com.zegama.workshopmongo.repository.UserRepository;
import com.zegama.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	//instanciar automaticamente no serviço
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	

}
