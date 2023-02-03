package com.example.demo.service;

import com.example.demo.model.Obra;
import com.example.demo.repository.ObraRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ObraService {
    @Autowired
    private ObraRepository obraRepository;

    public List<Obra> listAllObra() {return obraRepository.findAll();}

    public Obra getObra(Integer id) {


        return obraRepository.findById(id).get();
    }






}
