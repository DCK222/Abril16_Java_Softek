package com.softek.Abril16_Java_Softek.modelo.ejercicio2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Conductor {
    @Autowired
    private Ivehiculo vehiculo; //El atributo es una interface

    public String conducir() {
        return vehiculo.moverse();
    }
}
