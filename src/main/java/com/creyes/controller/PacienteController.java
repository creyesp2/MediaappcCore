package com.creyes.controller;

import com.creyes.entity.Paciente;
import com.creyes.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private IPacienteService service;

    @GetMapping
    public List<Paciente> getAll() throws Exception{
      return  service.getFindAllPaciente();
    }
}
