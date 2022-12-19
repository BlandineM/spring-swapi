package com.wildcodeschool.swapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Planet {
    private String name;
    @JsonProperty("rotation_period")
    private String rotationPeriod;
    @JsonProperty("orbital_period")
    private String orbitalPeriod;
    private String diameter;
    private String climate;
    private String gravity;
    private String terrain;
    @JsonProperty("surface_water")
    private String surfaceWater;
    private String population;
    private String[] residents;
    private String[] films;
    private String created;
    private String edited;
    private String url;


    public Planet(){
    }

    public String getClimate() {
        return climate;
    }

    public String getCreated() {
        return created;
    }

    public String getDiameter() {
        return diameter;
    }

    public String getGravity() {
        return gravity;
    }

    public String getName() {
        return name;
    }

    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public String getPopulation() {
        return population;
    }

    public String getRotationPeriod() {
        return rotationPeriod;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getSurfaceWater() {
        return surfaceWater;
    }

    public String getTerrain() {
        return terrain;
    }

    public String getEdited() {
        return edited;
    }

    public String[] getFilms() {
        return films;
    }

    public String[] getResidents() {
        return residents;
    }

    public String getUrl() {
        return url;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public void setFilms(String[] films) {
        this.films = films;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setResidents(String[] residents) {
        this.residents = residents;
    }

    public void setRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public void setSurfaceWater(String surfaceWater) {
        this.surfaceWater = surfaceWater;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
