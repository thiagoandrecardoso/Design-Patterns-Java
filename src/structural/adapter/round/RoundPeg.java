package structural.adapter.round;

/**
 * RoundPegs are compatible with RoundHoles.
 */
public class RoundPeg {
    private double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public RoundPeg() {
    }

    public double getRadius() {
        return radius;
    }
}
