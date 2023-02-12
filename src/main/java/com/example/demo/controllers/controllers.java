package com.example.demo.controllers;

import com.example.demo.models.Cat;
import com.example.demo.services.CatServiceImplement;
import com.example.demo.services.CatServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class controllers {

    @Autowired
    CatServices catServices;

    @GetMapping("/hej")
    public String hello(){

        return "Hi welcome to Sprint-Boot";
    }

    @GetMapping("/all")
    public ArrayList<Cat> getAllCat(){
        return catServices.getAllCat();
    }
    @GetMapping("/find/id")
    public Optional<Cat> getCatById(@PathVariable("id") String id){
        return catServices.getCatById(id);
    }
    @PostMapping("/save")
    public Cat saveCat(@RequestBody Cat cat){
        return catServices.saveCat(cat);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteCatById(@PathVariable("id") String id){
        if(catServices.deleteCatById(id))
            return "The Cat has been deleted!";
        else
            return "The Cat has not been deleted";
    }


}
