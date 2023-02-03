package com.example.demo.controller;

import com.example.demo.model.Artista;
import com.example.demo.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
   // UserService userService;
    ArtistaService artistaService;

    @GetMapping("")
   //public List<Artista> list() {return artistaService.listAllArtistas();}

   public List<Artista> list() {return artistaService.listAllArtista();}





  //  @GetMapping("/{id}")
    //public ResponseEntity<User> get(@PathVariable Integer id) {
//        try {
     //       User user = userService.getUser(id);
       //     return new ResponseEntity<User>(user, HttpStatus.OK);
  //      } catch (NoSuchElementException e) {
    //        return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
    //    }
   // }

   // @GetMapping("/artistas")

 //   @PostMapping("/")
   // public void add(@RequestBody User user) {
     //   userService.saveUser(user);
    //}
  //  @PutMapping("/{id}")
    //public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer id) {
      //  try {
        //    User existUser = userService.getUser(id);
          //  user.setId(id);
            //userService.saveUser(user);
           // return new ResponseEntity<>(HttpStatus.OK);
       // } catch (NoSuchElementException e) {
         //   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        //}
    //}
   // @DeleteMapping("/{id}")
    //public void delete(@PathVariable Integer id) {

      //  userService.deleteUser(id);
    //}
}
