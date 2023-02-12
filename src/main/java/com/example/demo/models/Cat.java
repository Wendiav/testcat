package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false)
    private String breed;

    @Column(nullable = false)
    private String locationOfOrigin;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String bodyType;

    @Column(nullable = false)
    private String coatPattern;

    public Cat(String id, String breed, String locationOfOrigin, String type, String bodyType, String coatPattern) {
        this.id = id;
        this.breed = breed;
        this.locationOfOrigin = locationOfOrigin;
        this.type = type;
        this.bodyType = bodyType;
        this.coatPattern = coatPattern;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getLocationOfOrigin() {
        return locationOfOrigin;
    }

    public void setLocationOfOrigin(String locationOfOrigin) {
        this.locationOfOrigin = locationOfOrigin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getCoatPattern() {
        return coatPattern;
    }

    public void setCoatPattern(String coatPattern) {
        this.coatPattern = coatPattern;
    }
}
