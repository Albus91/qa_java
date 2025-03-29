package com.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void testEatMeat() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void testGetFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittensOne() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensParams() {
        assertEquals(3, feline.getKittens(3));
    }

    @Test
    public void unknownAnimalTypeException() {
        Exception exception = assertThrows(Exception.class, () -> feline.getFood("Всеядные"));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }
}
