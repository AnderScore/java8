package functionalinterfaces;

import org.junit.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class FunctionalInterfacesTest {

    @Test
    public void functionalInterfacesTest() {
        Function<Integer, String> test = (i) -> i.toString();
        assertEquals("1", test.apply(1));

        Predicate<String> predicate = (s) -> s.length() > 0;
        assertTrue(predicate.test("large"));

        Predicate<String> predicate2 = (s) -> "large".equals(s);
        assertFalse(predicate.and(predicate2).test("lage"));
        assertTrue(predicate.and(predicate2).test("large"));
    }
}
