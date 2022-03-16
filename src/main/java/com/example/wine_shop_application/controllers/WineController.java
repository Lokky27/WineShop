package com.example.wine_shop_application.controllers;

import com.example.wine_shop_application.repositories.WineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wines")
public class WineController
{
    private final WineRepository repository;

    @Autowired
    public WineController(WineRepository repository)
    {
        this.repository = repository;
    }

    @GetMapping("/{wine_id}")
    public String getWineById(@PathVariable("wine_id") Long wine_id,
                              Model model)
    {
        return "";
    }

}
