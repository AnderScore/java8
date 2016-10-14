package methodconstructor;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ConstructorTest {

    @Test
    public void constructorReferences() {
        Function<byte[], String> f = String::new;

        byte[] data = new byte[1];
        data[0] = 'a';

        assertEquals("a", f.apply(data));
    }
}
