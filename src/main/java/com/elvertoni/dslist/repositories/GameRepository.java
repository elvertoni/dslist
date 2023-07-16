package com.elvertoni.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elvertoni.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
