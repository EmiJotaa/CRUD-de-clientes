package com.devmj.desafiocrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmj.desafiocrud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
