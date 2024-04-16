package com.softek.Abril16_Java_Softek.modelo.Ejercicio4;


public class Jefe implements IEmpleado{
    private IInforme informe;

    public Jefe(IInforme informe) {
        this.informe = informe;
    }

    public Jefe() {

    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    @Override
    public String getTareas() {
        return "Trabajo del jefe";
    }
}
