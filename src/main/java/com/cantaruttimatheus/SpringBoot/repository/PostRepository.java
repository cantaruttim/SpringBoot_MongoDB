package com.cantaruttimatheus.SpringBoot.repository;


import com.cantaruttimatheus.SpringBoot.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

// acesso à dados. Objetos que são responsáveis por efetuar operações básicas de acesso à dados.
@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    // 2) save, recupera, atualiza os dados ==> IR PARA SERVIÇOS
}
