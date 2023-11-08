package com.example.cardapio.controller;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodRequestDTO;
import com.example.cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Essa classe é um controller da aplicação
@RequestMapping("food") // mapear os requests que vierem para esse controller
public class FoodController {

    @Autowired //indicar para o spring para injetar a instancia na lista
    private FoodRepository repository; //instancia para a lista


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping //Vai enviar os dados no body da aplicação.
    public void saveFood(@RequestBody FoodRequestDTO data) {
        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping //O spring precisa entender quando o metodo for chamado pelo request mapping (food)
    public List<FoodResponseDTO> getAll() {

        List<FoodResponseDTO> foodList = (List<FoodResponseDTO>) repository.findAll().stream().map(FoodResponseDTO::new);
        return foodList;
    }
}
