package com.softek.Abril16_Java_Softek.modelo.Ejercicio3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Component
@Data
public class SeguroCoche {
    @Autowired
    private Italler taller;
    private String Aseguradora;

    public String reparar(Coche2 coche) {
        return taller.reparar(coche);
    }


}
