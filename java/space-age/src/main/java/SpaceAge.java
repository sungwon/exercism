
/**
 * Created by sungwon on 1/13/16.
 */
public class SpaceAge {


    public enum OrbitalPeriods {
        MERCURY_PERIOD(0.2408467),
        VENUS_PERIOD(0.61519726),
        MARS_PERIOD(1.8808158),
        JUPITER_PERIOD(11.862615),
        SATURN_PERIOD(29.447498),
        URANUS_PERIOD(84.016846),
        NEPTUNE_PERIOD(164.79132);

        private double value;

        private OrbitalPeriods(double value) {
            this.value = value;
        }
    }

    public final static double EARTH_YEAR_SECONDS =  31557600;

    private long seconds;

    public SpaceAge(long seconds) {
        this.seconds = seconds;
    }

    private double calculateAge(OrbitalPeriods orbitalPeriod) {
        return (seconds/(EARTH_YEAR_SECONDS * orbitalPeriod.value));
    }

    public long getSeconds() {
        return seconds;
    }

    public double onEarth() {
        return seconds/EARTH_YEAR_SECONDS;
    }

    public double onMercury() {
        return calculateAge(OrbitalPeriods.MERCURY_PERIOD);
    }

    public double onVenus() {
        return calculateAge(OrbitalPeriods.VENUS_PERIOD);
    }

    public double onMars() {
        return calculateAge(OrbitalPeriods.MARS_PERIOD);
    }

    public double onJupiter() {
        return calculateAge(OrbitalPeriods.JUPITER_PERIOD);
    }

    public double onSaturn() {
        return calculateAge(OrbitalPeriods.SATURN_PERIOD);
    }

    public double onUranus() {
        return calculateAge(OrbitalPeriods.URANUS_PERIOD);
    }

    public double onNeptune() {
        return calculateAge(OrbitalPeriods.NEPTUNE_PERIOD);
    }
}
