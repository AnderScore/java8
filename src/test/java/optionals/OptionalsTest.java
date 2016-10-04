package optionals;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OptionalsTest {

    @Test
    public void optional() {
        Optional<String> optional = giveMe(true);

        assertTrue(optional.isPresent());
        assertEquals("hejsan", optional.get());

        optional = giveMe(false);

        assertFalse(optional.isPresent());
        assertEquals("fallback", optional.orElse("fallback"));
    }

    private Optional<String> giveMe(boolean real) {
        if (real) {
            return Optional.of("hejsan");
        }

        return Optional.empty();
    }
}
