import org.junit.Test;

import java.util.concurrent.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class FutureTest {


    @Test
    public void threads() throws Exception {

        Runnable runnable = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("Foo " + name);
                Thread.sleep(1000);
                System.out.println("Bar " + name);
            } catch (InterruptedException e) { }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    @Test
    public void executor() throws Exception {
        /*
        The Concurrency API introduces the concept of an ExecutorService
        as a higher level replacement for working with threads directly
         */

        ExecutorService executor = Executors.newWorkStealingPool();
        Future<Integer> result = executor.submit(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
            return 20;
        });

        assertFalse(result.isDone());
        assertEquals(20, result.get().intValue());
        assertTrue(result.isDone());
    }



}
