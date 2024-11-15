package com.gameSuper.dslist.repositories;

import com.gameSuper.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

//Precisa colocar depois do Game o que seria o id, o id é do tipo long
public interface GameRepository extends JpaRepository<Game, Long> {
}
