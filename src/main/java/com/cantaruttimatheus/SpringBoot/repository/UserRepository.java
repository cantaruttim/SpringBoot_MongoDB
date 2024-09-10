package com.cantaruttimatheus.SpringBoot.repository;


import com.cantaruttimatheus.SpringBoot.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

// acesso à dados. Objetos que são responsáveis por efetuar operações básicas de acesso à dados.
@Repository
public interface UserRepository extends MongoRepository<User, String> {

    // 2) save, recupera, atualiza os dados ==> IR PARA SERVIÇOS
}
