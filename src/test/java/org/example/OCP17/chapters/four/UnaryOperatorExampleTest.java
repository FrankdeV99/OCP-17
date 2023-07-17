package org.example.OCP17.chapters.four;

import org.junit.jupiter.api.Test;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

public class UnaryOperatorExampleTest {

    @Test
    void testUnaryOperator_StringToUpperCase() {
        String smallLetters = "chewbacca";
        UnaryOperator<String> u1 = String::toUpperCase;

        String result = u1.apply(smallLetters);

        assertEquals("CHEWBACCA", result);
    }

    @Test
    void testBinaryOperator_StringConcat() {
        String s1 = "Han ";
        String s2 = "Solo";
        BinaryOperator<String> b1 = String::concat;

        String result = b1.apply(s1, s2);

        assertEquals("Han Solo", result);
    }
}
