/**
 * Created by sungwon on 1/6/16.
 */

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;


public class Meetup {

    private int month;
    private int year;


    public Meetup(int month, int year) {
        this.month = month;
        this.year = year;
    }


    public DateTime day(int dayOfTheWeek, MeetupSchedule schedule) {

        DateTime date = new DateTime(year, month, 1, 0, 0);
        int day = 1;
        int weekOfMonth = 1;

        switch (schedule) {
            case TEENTH:
                day = 13;
                break;
            case FIRST:
                break;
            case SECOND:
                weekOfMonth = 2;
                break;
            case THIRD:
                weekOfMonth = 3;
                break;
            case FOURTH:
                weekOfMonth = 4;
                break;
            case LAST:
                day = date.dayOfMonth().getMaximumValue() - 6;
                break;
        }

        do {
            date = new DateTime(year, month, day++, 0, 0);
        } while (date.getDayOfWeek() != dayOfTheWeek);

        return date.plusDays(7 * (weekOfMonth-1));
    }



}
