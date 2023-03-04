package structural.adapter.round;
/**
 * RoundHoles are compatible with RoundPegs.
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // Passo o pino para saber se cabe no buraco.
    public boolean fits(RoundPeg peg){
        return this.getRadius() > peg.getRadius();
    }
}
