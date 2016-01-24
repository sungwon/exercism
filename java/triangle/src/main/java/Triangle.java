/**
 * Created by sungwon on 1/22/16.
 */
public class Triangle {

    private TriangleKind kind;

    public Triangle(int a, int b, int c) throws TriangleException {
        this((double) a, (double) b, (double) c);
    }

    public Triangle(double a, double b, double c) throws TriangleException {

        int numberOfEqualSides = 0;

        // make sure length of triangle sides make sense
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new TriangleException();
        }

        // make sure triangle doesn't violate triange inequality
        if (a + b <= c || b + c <= a || a + c <= b) {
            throw new TriangleException();
        }

        if (a == b) {
            numberOfEqualSides++;
        }
        if (a == c) {
            numberOfEqualSides++;
        }
        if (b == c) {
            numberOfEqualSides++;
        }

        switch (numberOfEqualSides) {
            case 3:
                kind = TriangleKind.EQUILATERAL;
                break;
            case 1:
                kind = TriangleKind.ISOSCELES;
                break;
            case 0:
                kind = TriangleKind.SCALENE;
                break;
        }

    }

    public TriangleKind getKind() {
        return kind;
    }
}
