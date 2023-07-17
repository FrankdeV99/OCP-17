package org.example.OCP17.chapters.four;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionExampleTest {

    @Test
    void testFunction_ReturnCountInLong() {
        String s1 = "Luke Skywalker";
        Function<String, Long> f1 = s -> s.chars().count();

        Long result = f1.apply(s1);

        assertEquals(Long.valueOf(14), result);
    }

    @Test
    void testBiFunction_ReturnCountOfTwoStrings() {
        String chewie = "Chewbacca";
        String han = "Han Solo";
        BiFunction<String, String, Long> bf1 = (s1, s2) -> s1.concat(s2).chars().count();

        Long result = bf1.apply(chewie,han);

        assertEquals(Long.valueOf(17), result);
    }
}
