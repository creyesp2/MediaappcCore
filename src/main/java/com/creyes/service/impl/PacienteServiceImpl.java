package com.creyes.service.impl;

import com.creyes.entity.Paciente;
import com.creyes.repository.IpacienteRepo;
import com.creyes.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class PacienteServiceImpl implements IPacienteService {
    @Autowired
    private IpacienteRepo repo;
    @Override
    public Paciente save(Paciente paciente) throws Exception {
        return repo.save(paciente);
    }

    @Override
    public Paciente update(Paciente paciente) throws Exception {
        return repo.save(paciente);
    }

    @Override
    public List<Paciente> getFindAllPaciente() throws Exception {
        return repo.findAll();
    }

    @Override
    public Paciente findById(Integer id) throws Exception {
        Optional<Paciente> op = repo.findById(id);
        return op.isPresent() ? op.get(): new Paciente();
    }

    @Override
    public void delete(Integer id) throws Exception {
      repo.deleteById(id);
    }
}
