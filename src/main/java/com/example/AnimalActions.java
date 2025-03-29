package com.example;

import java.util.List;

public interface AnimalActions {
    int getKittens();
    List<String> getFood(String animalType) throws Exception;
}
