package com.example.demo.controller;

import com.example.demo.model.Obra;
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
   // UserService userService;
    //ObraService artistaService;
    ObraService obraService;
    @GetMapping("")
   public List<Obra> list() {return obraService.listAllObra();}

  // public List<Obra> list() {return obraService.listAllObra();}

    @GetMapping("/{id}")
    public ResponseEntity<Obra> get(@PathVariable Integer id) {
        try {
            Obra obra = obraService.getObra(id);
            return new ResponseEntity<Obra>(obra, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Obra>(HttpStatus.NOT_FOUND);
        }
    }

}
