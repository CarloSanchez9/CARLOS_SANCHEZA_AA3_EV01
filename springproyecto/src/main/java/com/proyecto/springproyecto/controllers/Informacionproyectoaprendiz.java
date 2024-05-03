package com.proyecto.springproyecto.controllers;

import java.time.LocalDateTime;

public class Informacionproyectoaprendiz {

    private LocalDateTime FechaHoy;
    private String NombreAprendiz;
    private String ApellidoAprendiz;
    private String FichaAprendiz;
    public Informacionproyectoaprendiz(LocalDateTime fechaHoy, String nombreAprendiz, String apellidoAprendiz,
            String fichaAprendiz) {
        FechaHoy = fechaHoy;
        NombreAprendiz = nombreAprendiz;
        ApellidoAprendiz = apellidoAprendiz;
        FichaAprendiz = fichaAprendiz;
    }
    public Informacionproyectoaprendiz() {
    }
    public LocalDateTime getFechaHoy() {
        return FechaHoy;
    }
    public String getNombreAprendiz() {
        return NombreAprendiz;
    }
    public String getApellidoAprendiz() {
        return ApellidoAprendiz;
    }
    public String getFichaAprendiz() {
        return FichaAprendiz;
    }
    public void setFechaHoy(LocalDateTime fechaHoy) {
        FechaHoy = fechaHoy;
    }
    public void setNombreAprendiz(String nombreAprendiz) {
        NombreAprendiz = nombreAprendiz;
    }
    public void setApellidoAprendiz(String apellidoAprendiz) {
        ApellidoAprendiz = apellidoAprendiz;
    }
    public void setFichaAprendiz(String fichaAprendiz) {
        FichaAprendiz = fichaAprendiz;
    }

    

}
