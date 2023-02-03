package com.example.demo.service;

import com.example.demo.model.Museo;
import com.example.demo.repository.MuseoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class MuseoService {
    @Autowired
    private MuseoRepository museoRepository;

    public List<Museo> listAllMuseo() {return museoRepository.findAll();}

    public Museo getMuseo(Integer id) {

        return museoRepository.getReferenceById(id);
    }






}
