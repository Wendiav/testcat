package com.example.demo.services;


import com.example.demo.models.Cat;
import com.example.demo.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class CatServiceImplement implements CatServices{

   @Autowired
   CatRepository catRepository;


   @Override
   public ArrayList<Cat> getAllCat() {
      return (ArrayList<Cat>) catRepository.findAll() ;
   }

   @Override
   public Optional<Cat> getCatById(String id) {
      return catRepository.findById(id);
   }

   @Override
   public Cat saveCat(Cat cat) {
      return catRepository.save(cat);
   }


   @Override
   public boolean deleteCatById(String id) {
      try{
         Optional<Cat> cat = getCatById(id);
         catRepository.delete(cat.get());
         return true;
      }catch (Exception e){
         return false;
      }
   }


}
