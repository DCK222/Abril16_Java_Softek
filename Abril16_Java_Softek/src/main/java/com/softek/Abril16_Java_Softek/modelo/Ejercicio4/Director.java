package com.softek.Abril16_Java_Softek.modelo.Ejercicio4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Data
public class Director implements IEmpleado {
    @Autowired
    private IInforme informe;


    public Director(IInforme informe) {
        this.informe = informe;
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    @Override
    public String getTareas() {
        return "Teareas del Director";
    }
}
