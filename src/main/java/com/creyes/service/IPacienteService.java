package com.creyes.service;

import com.creyes.entity.Paciente;

import java.util.List;

public interface IPacienteService {
    Paciente save(Paciente paciente) throws Exception;
    Paciente update(Paciente paciente)throws Exception;
    List<Paciente> getFindAllPaciente() throws Exception;
    Paciente findById(Integer id) throws Exception;
    void delete (Integer id) throws Exception;

}
