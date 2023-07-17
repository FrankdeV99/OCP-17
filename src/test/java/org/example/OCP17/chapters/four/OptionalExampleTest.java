package org.example.OCP17.chapters.four;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OptionalExampleTest {

    @Test
    void testAverage_withScores_returnOptionalWithValue() {
        int[] scores = {1,2,3,4,5,6,7,8,9};

        Optional<Double> result = OptionalExample.average(scores);

        assertEquals(Optional.of(5.0), result);
    }

    @Test
    void testAverage_withoutScores_returnEmptyOptional() {
        int[] scores = {};

        Optional<Double> result = OptionalExample.average(scores);

        assertEquals(Optional.empty(), result);
    }

    @Test
    void testMonadicAverage_withScores_returnOptionalWithValue() {
        int[] scores = {1,2,3,4,5,6,7,8,9};

        Optional<Double> result = OptionalExample.monadicAverage(scores);

        assertEquals(Optional.of(5.0), result);
    }

    @Test
    void testMonadicAverage_withoutScores_returnEmptyOptional() {
        int[] scores = null;

        Optional<Double> result = OptionalExample.monadicAverage(scores);

        assertEquals(Optional.empty(), result);
    }

}
