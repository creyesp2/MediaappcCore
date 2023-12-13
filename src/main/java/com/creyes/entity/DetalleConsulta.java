package com.creyes.entity;

import jakarta.persistence.*;

@Entity
@Table
public class DetalleConsulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetalle;
    @ManyToOne()
    @JoinColumn(name = "id?consulta",nullable = false,foreignKey = @ForeignKey(name ="FK_detalle_consulta"))
    private Consulta consulta;
    @Column(name = "diagnostico",nullable = false,length = 100)
    private String diagnostico;
    @Column(name = "tratamiento",nullable = false,length = 100)
    private String tratamiento;

    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
}
