package com.example.cardapio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Essa classe é um controller da aplicação
@RequestMapping("food") // mapear os requests que vierem para esse controller
public class FoodController {
    @GetMapping //O spring precisa entender quando o metodo for chamado pelo request mapping (food)
    public void getAll() {

    }
}
