package br.com.thomasdacosta.controller;

import br.com.thomasdacosta.api.DefaultApiClient;
import br.com.thomasdacosta.model.CharacterDataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marvel")
public class MarvelController {

    @Autowired
    private DefaultApiClient defaultApiClient;

    @GetMapping("personagens")
    public ResponseEntity<CharacterDataWrapper> buscarPersonagens(
            @RequestParam("id") String id) {

        return defaultApiClient.characterById(id,
                "1",
                "f59dbe01285f1d360542b5c47a9516e3",
                "0ea6be79e04ac1b0400d65ffc11088f9");
    }

}
