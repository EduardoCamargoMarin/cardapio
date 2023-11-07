package com.example.cardapio.controller;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Essa classe é um controller da aplicação
@RequestMapping("food") // mapear os requests que vierem para esse controller
public class FoodController {

    @Autowired //indicar para o spring para injetar a instancia na lista
    private FoodRepository repository; //instancia para a lista
    @GetMapping //O spring precisa entender quando o metodo for chamado pelo request mapping (food)
    public List<Food> getAll() {

        List<Food> foodList = repository.findAll();
        return foodList;
    }
}
