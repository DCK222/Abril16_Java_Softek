package com.softek.Abril16_Java_Softek.modelo.Ejercicio3;

import org.springframework.stereotype.Component;

@Component
public class TallerMecanica implements Italler{
    @Override
    public String reparar(Coche2 coche) {
        return "Coche Arreglado...";
    }
}
