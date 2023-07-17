package org.example.OCP17.chapters.four;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;

public class OptionalExample {

    public static Optional<Double> average(int... scores) {
        return scores.length == 0 ? Optional.empty() : Optional.of((double) sumFunction().apply(scores) / scores.length);
    }

    public static Optional<Double> monadicAverage(int... scores) {
        return Optional.ofNullable(scores)
                .map(ints -> sumFunction().apply(ints))
                .map(score -> getAverage(score, scores.length));
    }

    private static Function<int[], Integer> sumFunction() {
        return ints -> Arrays.stream(ints).sum();
    }

    private static double getAverage(Integer total, int length) {
        return (double) total / length;
    }
}
