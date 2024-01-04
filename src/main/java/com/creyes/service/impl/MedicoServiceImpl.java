package com.creyes.service.impl;

import com.creyes.entity.Medico;
import com.creyes.repository.IGenericRepo;
import com.creyes.repository.IMedicoRepo;
import com.creyes.repository.IpacienteRepo;
import com.creyes.service.ICRUD;
import com.creyes.service.IMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MedicoServiceImpl extends CRUDImpl<Medico,Integer> implements IMedicoService {

    @Autowired
    private IMedicoRepo repo;

    @Override
    protected IGenericRepo<Medico, Integer> getRepo() {
        return repo;
    }
}
