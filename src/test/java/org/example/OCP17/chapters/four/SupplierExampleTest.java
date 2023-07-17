package org.example.OCP17.chapters.four;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SupplierExampleTest {

    @Test
    void testSupplier() {
        Supplier<LocalDate> birthday = () -> LocalDate.of(1990,5,26);
        LocalDate franksBirthday = LocalDate.of(1990, 5, 26);

        LocalDate result = birthday.get();

        assertEquals(franksBirthday, result);
    }
}
