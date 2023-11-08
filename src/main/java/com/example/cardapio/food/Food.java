package com.example.cardapio.food;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "foods")
@Entity (name = "foods")
@Getter
@NoArgsConstructor //declare um constrututor que não recebe argumento
@EqualsAndHashCode//declare um constrututor que recebe argumento

public class Food {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //Determinando a PK
    private Long id;
    private String title;
    private String image;
    private Integer price;
    public Food(FoodRequestDTO data) {
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }
}
