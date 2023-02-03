package com.example.demo.service;

import com.example.demo.model.Artista;
import com.example.demo.repository.ArtistaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ArtistaService {
    @Autowired
    private ArtistaRepository artistaRepository;

    public List<Artista> listAllArtista() {return artistaRepository.findAll();}





}
