package com.gameSuper.dslist.services;

import com.gameSuper.dslist.dto.GameListDTO;
import com.gameSuper.dslist.dto.GameMinDTO;
import com.gameSuper.dslist.entities.Game;
import com.gameSuper.dslist.entities.GameList;
import com.gameSuper.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
