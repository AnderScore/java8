package lambda;

import org.junit.Test;

import java.util.concurrent.*;

public class LambdaTest {

    @Test
    public void lambda() {
        new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return null;
            }
        });

        new FutureTask<String>(() -> {
            return null;
        });
    }

}
