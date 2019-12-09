package com.example.demo.controller;

import com.example.demo.model.Hobbit;
import com.example.demo.repository.HobbitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//Klasa vidok dzieki niej widzimy co jest na tapecie
@RestController
public class HobbitCntroller {
//    @GetMapping("/hello")
//    public String hello(){
//        return "Hello Iwona";
//    }
//    @GetMapping("/start")
//    public String start(){
//        return "Witam ponownie Iwona";
//    }
    // wstrzykujemy implementacje interfejsu


    @Autowired
    private HobbitRepository hobbitRepository;

    //iterable podaje konkretny obiekt klasy
// zaciagamy dane z bazy danych
    @GetMapping("/moje-hobbity")
    public Iterable<Hobbit> mojeHobbity(){

        return hobbitRepository.findAll();
    }
}
