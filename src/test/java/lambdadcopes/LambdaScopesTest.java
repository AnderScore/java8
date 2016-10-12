package lambdadcopes;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class LambdaScopesTest {

    @Test
    public void localVariables() {
        int add = 2;
        List<Integer> collect = Arrays.asList(1, 2, 3)
                .stream()
                .map(o -> o + add)
                .collect(Collectors.toList());

        assertEquals(Arrays.asList(3, 4, 5), collect);
    }
}
