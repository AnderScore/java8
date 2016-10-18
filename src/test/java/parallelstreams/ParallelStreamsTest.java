package parallelstreams;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.fail;

public class ParallelStreamsTest {

    @Test
    public void parallelStreams() {
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        //Sequential
        long start = System.nanoTime();

        values.stream().sorted().count();

        long stop = System.nanoTime();

        long sequentialTime = stop - start;
        System.out.println("Sequential time:" + sequentialTime);


        //Parallel
        start = System.nanoTime();

        values.parallelStream().sorted().count();

        stop = System.nanoTime();

        long parallelTime = stop - start;
        System.out.println("Parallel time:" + parallelTime);

        Assert.assertTrue(parallelTime < sequentialTime);
    }
}
