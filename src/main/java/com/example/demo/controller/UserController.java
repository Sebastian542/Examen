package com.example.demo.controller;

import com.example.demo.model.Museo;
import com.example.demo.model.Obra;
import com.example.demo.service.MuseoService;
import com.example.demo.service.ObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired

    ObraService obraService;
    MuseoService museoService;
    @GetMapping("")
    public List<Obra> list() {return obraService.listAllObra();}

    @GetMapping("{id}")

    public ResponseEntity<Obra> get(@PathVariable Integer id) {
        try {
            Obra obra = obraService.getObra(id);
            if(obra.getPais().equals("COLOMBIA")){
                return new ResponseEntity<Obra>(obra, HttpStatus.OK);

            }
            return null;
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Obra>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/museos/{ciudad}")
    public ResponseEntity<Museo> get(@PathVariable String ciudad) {
        try {
            Museo museo = museoService.getMuseo(Integer.valueOf(ciudad));
            if (museo.getCiudad().equals(ciudad) && museo.getNombre().startsWith("L")) {
                return new ResponseEntity<Museo>(museo, HttpStatus.OK);

            }

        } catch (NoSuchElementException e) {
            return new ResponseEntity<Museo>(HttpStatus.NOT_FOUND);
        }
        return null;
    }
}
