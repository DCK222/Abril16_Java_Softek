package com.softek.Abril16_Java_Softek.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Ejercicio1 {

    String saludooo = "holaaaa";


    public String getSaludo() {
        return saludooo;
    }
}

