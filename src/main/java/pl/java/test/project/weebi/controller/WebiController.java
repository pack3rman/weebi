package pl.java.test.project.weebi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import pl.java.test.project.weebi.model.Game;
import java.util.Collections;
import java.util.List;

@Controller
public class WebiController {

    @PostMapping
    public void addGame(){

    }

    @GetMapping
    public ResponseEntity<List<Game>> getAllGames(){


        return (ResponseEntity<List<Game>>) Collections.emptyList();
    }
}
