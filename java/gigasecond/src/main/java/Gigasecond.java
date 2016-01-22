/**
 * Created by sungwon on 1/21/16.
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Gigasecond {

    private final static long GIGASECOND = 1000000000;

    private LocalDateTime gigaDate;

    public Gigasecond(LocalDateTime dateTime) {
        gigaDate = dateTime.plusSeconds(GIGASECOND);
    }

    public Gigasecond(LocalDate date) {
        this(LocalDateTime.of(date, LocalTime.of(0,0)));
    }

    public LocalDateTime getDate() {
        return gigaDate;
    }

}
