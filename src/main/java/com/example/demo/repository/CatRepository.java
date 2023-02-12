package com.example.demo.repository;

import com.example.demo.models.Cat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface CatRepository extends MongoRepository<Cat, String> {
    /*ArrayList<Cat> getAllCat();

    Optional<Cat> getCatById(String id);
    Cat saveCat(Cat cat);

    boolean deleteCatById(String id);*/
}
