package maps;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MapsTest {

    @Test
    public void maps() {
        Map<String, String> map = new HashMap<>();
        map.putIfAbsent("foo", "bar");
        map.putIfAbsent("foo", "x");

        map.computeIfPresent("foo", (key, val) -> key + val);
        assertEquals("foobar", map.get("foo"));
    }
}
