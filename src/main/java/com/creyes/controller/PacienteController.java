package com.creyes.controller;

import com.creyes.entity.Paciente;
import com.creyes.exception.ModeloNotFoundException;
import com.creyes.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private IPacienteService service;

    @GetMapping
    public ResponseEntity<List<Paciente>> getAll() throws Exception {
        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> getPacienteById(@PathVariable("id") Integer id) throws Exception {
      Paciente obj = service.listarPorId(id);

      if (obj==null){
          throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
      }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Paciente> addPaciente(@RequestBody Paciente paciente) throws Exception {
        return new ResponseEntity<>(service.registrart(paciente), HttpStatus.CREATED);
    }

    @PutMapping
    ResponseEntity<Paciente> updatePaciente(@RequestBody Paciente paciente) throws Exception{
        return new ResponseEntity<>(service.modificar(paciente),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete (@PathVariable("id") Integer id) throws  Exception{
        service.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
