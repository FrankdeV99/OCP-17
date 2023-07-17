package org.example.OCP17.chapters.four;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsumerExampleTest {

    @Test
    void testConsumer() {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = input -> System.out.println(input);

        c1.accept("Chewie and Han went to the Millenium Falcon");
        c2.accept("Chewie and Han didn't go to the Millenium Falcon");
    }

    @Test
    void testBiConsumer() {
        ArrayList<String> spaceObjects = new ArrayList<>();
        BiConsumer<String, ArrayList<String>> bc1 = (spaceObject, objectList) -> objectList.add(spaceObject);

        bc1.accept("Millenium Falcon", spaceObjects);

        assertEquals(1, spaceObjects.size());
    }
}
