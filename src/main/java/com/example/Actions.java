package com.example;

import java.util.List;

public interface Actions {
    int getKittens();
    List<String> getFood(String animalType) throws Exception;
}
