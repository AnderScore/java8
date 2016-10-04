package streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class StreamTest {

    @Test
    public void stream() {
        List<String> fruits = Arrays.asList("strawberry", "apple", "blueberry");

        List<String> aFruits = fruits.stream().filter(f -> f.contains("a")).collect(Collectors.toList());

        assertEquals("strawberry,apple", aFruits.stream().reduce((s1, s2) -> s1 + "," + s2).get());
    }
}
