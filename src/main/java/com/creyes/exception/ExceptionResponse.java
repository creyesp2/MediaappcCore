package com.creyes.exception;

import java.time.LocalTime;

public class ExceptionResponse {
    private LocalTime fecha;
    private String mensaje;

    private String detalle;


    public ExceptionResponse() {

    }

    public ExceptionResponse(LocalTime fecha, String mensaje, String detalle) {
        this.fecha = fecha;
        this.mensaje = mensaje;
        this.detalle = detalle;
    }

    public LocalTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalTime fecha) {
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
