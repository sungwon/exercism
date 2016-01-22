
/**
 * Created by sungwon on 1/13/16.
 */
public class SpaceAge {


    private final static double EARTH_YEAR_SECONDS =  31557600;
    private final static double MERCURY_PERIOD = 0.2408467;
    private final static double VENUS_PERIOD = 0.61519726;
    private final static double MARS_PERIOD = 1.8808158;
    private final static double JUPITER_PERIOD = 11.862615;
    private final static double SATURN_PERIOD = 29.447498;
    private final static double URANUS_PERIOD = 84.016846;
    private final static double NEPTUNE_PERIOD = 164.79132;

    private long seconds;

    public SpaceAge(int seconds) {
        this.seconds = seconds;
    }

    public SpaceAge(long seconds) {
        this.seconds = seconds;
    }

    private double calculateAge(double orbitalPeriod) {
        return (seconds/(EARTH_YEAR_SECONDS * orbitalPeriod));
    }

    public long getSeconds() {
        return seconds;
    }

    public double onEarth() {
        return seconds/EARTH_YEAR_SECONDS;
    }

    public double onMercury() {
        return calculateAge(MERCURY_PERIOD);
    }

    public double onVenus() {
        return calculateAge(VENUS_PERIOD);
    }

    public double onMars() {
        return calculateAge(MARS_PERIOD);
    }

    public double onJupiter() {
        return calculateAge(JUPITER_PERIOD);
    }

    public double onSaturn() {
        return calculateAge(SATURN_PERIOD);
    }

    public double onUranus() {
        return calculateAge(URANUS_PERIOD);
    }

    public double onNeptune() {
        return calculateAge(NEPTUNE_PERIOD);
    }
}
