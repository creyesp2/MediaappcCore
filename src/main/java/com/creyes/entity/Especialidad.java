package com.creyes.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "especialidad")
public class Especialidad {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idEspecialidad;
  @Column(name = "nombre_categoria",nullable = false,length = 100)
  private String Nombre;
  @Column(name = "descripcion_categoria")
  private String descripcion;

    public Integer getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Integer idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
