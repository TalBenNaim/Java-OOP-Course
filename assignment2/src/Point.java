// 212749071 Tal Ben Naim

/**
 * Class Point represent a geometrical point.
 * The class contains methods for commonly used methods in geometry regrading a point.
 */
public class Point {
    // fields
    private double x;
    private double y;

    /**
     * Constructor of point.
     * @param x The x position of the point in the space
     * @param y The y position of the point in the space
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Calculate the distance of this point to the other point using standard the formula.
     * @param other The other point
     * @return The distance or Double.NaN if it can't be calculated.
     */
    public double distance(Point other) {
        if (other != null) {
            return Math.sqrt(Math.pow(x - other.getX(), 2) + Math.pow(y - other.getY(), 2));
        } else {
            // Double.NaN means that we cant calculate distance, since other Point is null
            return Double.NaN;
        }
    }

    // equals -- return true is the points are equal, false otherwise

    /**
     * Check if this point equals to another point.
     * @param other The other point
     * @return if equals: true, else: false
     */
    public boolean equals(Point other) {
        // we compare using the utility class CompareDouble for accurate comparison
        if (other != null) {
            return CompareDouble.thresholdCompare(x, other.getX()) && CompareDouble.thresholdCompare(y, other.getY());
        } else {
            return false;
        }
    }

    /**
     * Getter for field x.
     * @return the x of this point
     */
    public double getX() {
        return x;
    }

    /**
     * Getter for field y.
     * @return the y of this point
     */
    public double getY() {
        return y;
    }

    /**
     * set the x of this point to a new x.
     * @param x the new x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * set the y of this point to a new y.
     * @param y the new y
     */
    public void setY(double y) {
        this.y = y;
    }
}