package com.creyes.service.impl;

import com.creyes.entity.Paciente;
import com.creyes.repository.IGenericRepo;
import com.creyes.repository.IpacienteRepo;
import com.creyes.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class PacienteServiceImpl extends CRUDImpl<Paciente,Integer> implements IPacienteService {
    @Autowired
    private IpacienteRepo repo;

    @Override
    protected IGenericRepo<Paciente, Integer> getRepo() {
        return repo;
    }
}
