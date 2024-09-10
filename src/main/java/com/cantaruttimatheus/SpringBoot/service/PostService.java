package com.cantaruttimatheus.SpringBoot.service;

import com.cantaruttimatheus.SpringBoot.domain.Post;
import com.cantaruttimatheus.SpringBoot.repository.PostRepository;
import com.cantaruttimatheus.SpringBoot.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired // o Spring busca a definição de Obj e ele instancia o obg automaticamnete
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> finByTitle(String text) {
        //return repo.findByTitleContainingIgnoreCase(text);
        return repo.searchTitle(text);
    }

}
