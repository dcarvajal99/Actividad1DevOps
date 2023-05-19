package com.kibernumacademy.miapp;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
	
	@Test
    void testcalculateDoubleEvens() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(50, App.calculateDoubleOdds(numbers));
    }

    @Test
    void testConvertToUpperCase() {
        List<String> strings = Arrays.asList("HOLA", "MUNDO", "java", "8");
        assertEquals(Arrays.asList("hola", "mundo", "java", "8"), App.convertToLowerCase(strings));
    }

}
