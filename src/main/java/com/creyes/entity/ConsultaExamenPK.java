package com.creyes.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
@Embeddable
public class ConsultaExamenPK  implements Serializable {
    private static final long serialVersionUID=1L;
    @ManyToOne
    @JoinColumn(name ="id_consulta",nullable=false)
    private Consulta consulta;
    @ManyToOne
    @JoinColumn(name = "id_examen",nullable = false)
    private Examen examen;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConsultaExamenPK that)) return false;
        return Objects.equals(consulta, that.consulta) && Objects.equals(examen, that.examen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consulta, examen);
    }
}
