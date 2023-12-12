package com.creyes.repository;

import com.creyes.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IpacienteRepo extends JpaRepository<Paciente, Integer> {
}


