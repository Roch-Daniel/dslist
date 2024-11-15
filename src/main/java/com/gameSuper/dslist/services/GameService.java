package com.gameSuper.dslist.services;

import com.gameSuper.dslist.dto.GameMinDTO;
import com.gameSuper.dslist.entities.Game;
import com.gameSuper.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result =  gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map( x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
