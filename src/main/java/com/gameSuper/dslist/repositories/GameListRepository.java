package com.gameSuper.dslist.repositories;

import com.gameSuper.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

//Precisa colocar depois do Game o que seria o id, o id é do tipo long
public interface GameListRepository extends JpaRepository<GameList, Long> {
}
