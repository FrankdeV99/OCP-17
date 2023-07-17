package org.example.OCP17.chapters.four;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class PredicateExampleTest {

    @Nested
    class PredicateExamples {

        private final String emptyString = "";
        @Test
        void testEmptyString_MethoDReference_ReturnTrue() {
            Predicate<String> p1 = String::isEmpty;

            boolean result = p1.test(emptyString);

            assertTrue(result);
        }

        @Test
        void testEmptyStringPredicate_Lambda_ReturnTrue() {
            Predicate<String> p2 = string -> string.isEmpty();

            boolean result = p2.test(emptyString);

            assertTrue(result);
        }
    }

    @Nested
    class BiPredicateExamples {

        private final String firstName = "Han";
        private final String fullName = "Han Solo";
        @Test
        void testStartsWith_MethodReference_ReturnTrue() {
            BiPredicate<String, String> b1 = String::startsWith;

            boolean result = b1.test(fullName, firstName);

            assertTrue(result);
        }

        @Test
        void testStartsWith_Lambda_ReturnTrue() {
            BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

            boolean result = b2.test(fullName, firstName);

            assertTrue(result);
        }

        @Test
        void testStartsWith_MethodReference_WrongOrder_ReturnFalse() {
            BiPredicate<String, String> b3 = String::startsWith;

            boolean result = b3.test(firstName, fullName);

            assertTrue(result);
        }
    }

}
