package com.creyes.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMedico;
    @Column(name = "nombres",nullable = false, length = 70)
    private String nombres;
    @Column(name = "apellidos",nullable = false,length = 70)
    private String apellidos;
    @Column(name = "cmp", nullable = false,length = 10)
    private String cmp;
    @Column(name = "foto_url",nullable = true)
    private String fotoUtl;


    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCmp() {
        return cmp;
    }

    public void setCmp(String cmp) {
        this.cmp = cmp;
    }

    public String getFotoUtl() {
        return fotoUtl;
    }

    public void setFotoUtl(String fotoUtl) {
        this.fotoUtl = fotoUtl;
    }
}
