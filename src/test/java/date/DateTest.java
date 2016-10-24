package date;

import org.junit.Assert;
import org.junit.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTest {

    @Test
    public void date() {
        Instant now = Instant.ofEpochSecond(1473751592);

        ZoneId tz = ZoneId.of("Asia/Tokyo");

        ZonedDateTime zonedDateTime = now.atZone(tz);
        LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
        OffsetDateTime offsetDateTime = zonedDateTime.toOffsetDateTime();

        Assert.assertEquals("2016-09-13T16:26:32+09:00[Asia/Tokyo]", zonedDateTime.toString());
        Assert.assertEquals("2016-09-13T16:26:32", localDateTime.toString());
        Assert.assertEquals("2016-09-13T16:26:32+09:00", offsetDateTime.toString());

        OffsetDateTime sthlm = now.atZone(ZoneId.of("Europe/Stockholm")).toOffsetDateTime();
        OffsetDateTime london = now.atZone(ZoneId.of("Europe/London")).toOffsetDateTime();

        Assert.assertEquals("2016-09-13T09:26:32+02:00", sthlm.toString());
        Assert.assertEquals("2016-09-13T08:26:32+01:00", london.toString());
    }

    @Test
    public void duration() {
        Duration duration = Duration.between(Instant.now(), Instant.now().plus(1, ChronoUnit.MINUTES));
        Assert.assertEquals(60, duration.getSeconds());
    }
}
