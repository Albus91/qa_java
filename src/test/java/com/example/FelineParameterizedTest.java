package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final String animalType;
    private final List<String> expectedFood;

    public FelineParameterizedTest(String animalType, List<String> expectedFood) {
        this.animalType = animalType;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Хищник", Arrays.asList("Животные", "Птицы", "Рыба")},
                {"Травоядное", Arrays.asList("Трава", "Различные растения")},
                {"Всеядное", Arrays.asList("Жуки", "Мед")}
        });
    }

    @Test
    public void testGetFood() throws Exception {
        Feline feline = new Feline();
        try {
            List<String> actualFood = feline.getFood(animalType);
            assertEquals(expectedFood, actualFood);
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }
}