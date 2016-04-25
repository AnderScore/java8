package interfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterfaceTest {

    @Test
    public void defaultMethods() {
        Man man = new Man();
        assertEquals("hello", man.says());
    }

    @Test
    public void overrideDefault() {
        Woman woman = new Woman();
        assertEquals("Hi!", woman.says());
    }
}
