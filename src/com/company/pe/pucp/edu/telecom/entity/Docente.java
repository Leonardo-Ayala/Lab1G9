package com.company.pe.pucp.edu.telecom.entity;

public class Docente extends Usuario {
    private String yearInicio;
    private String cantidadCursos;

    public String getYearInicio() {
        return yearInicio;
    }

    public void setYearInicio(String yearInicio) {
        this.yearInicio = yearInicio;
    }

    public String getCantidadCursos() {
        return cantidadCursos;
    }

    public void setCantidadCursos(String cantidadCursos) {
        this.cantidadCursos = cantidadCursos;
    }
}
