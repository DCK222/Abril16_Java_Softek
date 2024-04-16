package com.softek.Abril16_Java_Softek.modelo.Ejercicio4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Secretario implements IEmpleado{
    private IInforme informe;
    private IEmpleado tareas;
    private String empresa;
    private String email ;

    public Secretario(String empresa, String email) {
        this.empresa = empresa;
        this.email = email;
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    @Override
    public String getTareas() {
        return tareas.getTareas();
    }


    public void setInforme(IInforme informe){
    this.informe = informe;
    }


}
