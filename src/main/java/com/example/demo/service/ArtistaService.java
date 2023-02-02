package com.example.demo.service;

import com.example.demo.model.Artista;
import com.example.demo.model.User;
import com.example.demo.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ArtistaService {
    @Autowired
    private ArtistaRepository artistaRepository;
    public List<Artista> listAllArtistas() {
        return artistaRepository.findAll();
    }



    public Artista getUser(Integer id) {
        return artistaRepository.findById(id).get();
    }


}
