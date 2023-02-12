package com.example.demo.services;

import com.example.demo.models.Cat;

import java.util.ArrayList;
import java.util.Optional;


public interface CatServices {

    ArrayList<Cat> getAllCat();

    Optional<Cat> getCatById(String id);
    Cat saveCat(Cat cat);

    boolean deleteCatById(String id);

}
