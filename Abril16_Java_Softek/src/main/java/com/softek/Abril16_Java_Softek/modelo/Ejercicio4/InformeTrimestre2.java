package com.softek.Abril16_Java_Softek.modelo.Ejercicio4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class InformeTrimestre2 implements IInforme{
    @Override
    public String getInforme() {
        return "Informe trimsestre 2";
    }
}
