package com.zegama.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zegama.workshopmongo.domain.Post;
import com.zegama.workshopmongo.repository.PostRepository;
import com.zegama.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	//instanciar automaticamente no serviço
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
}
