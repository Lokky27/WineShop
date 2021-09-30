package com.example.wine_shop_application.controllers;

import com.example.wine_shop_application.models.Wine;
import com.example.wine_shop_application.repositories.WineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/wines")
public class WineController
{
    private WineRepository repository;

    @Autowired
    public WineController(WineRepository repository)
    {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<Wine>> getAllWines()
    {
        Iterable<Wine> wineIterable = repository.findAll();
        List<Wine> wines = new ArrayList<>();
        for (Wine wine : wineIterable)
        {
            wines.add(wine);
        }
        return new ResponseEntity<>(wines, HttpStatus.OK);
    }

}
