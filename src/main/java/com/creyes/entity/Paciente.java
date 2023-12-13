package com.creyes.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPaciente;
    @Column(name ="nombre",nullable = false,length = 70)
    private String nombre;
    @Column(name ="apellidos",nullable = false,length = 70)
    private String apellidos;
    @Column(name ="dpi",nullable = false,length = 70)
    private String dpi;
    @Column(name ="direccion",nullable = false,length = 70)
    private String direccion;
    @Column(name ="telefono",nullable = false,length = 70)
    private String telefono;
    @Column(name ="email",nullable = false,length = 70)
    private String email;

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
