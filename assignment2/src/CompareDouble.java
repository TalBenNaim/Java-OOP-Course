// 212749071 Tal Ben Naim

/**
 * A utility class to compare two doubles using threshold method.
 */
public final class CompareDouble {

    /**
     * Compare number and other using the threshold method.
     * (Comparing the difference to epsilon - a very small number)
     * @param number The first number to compare
     * @param other The second number to compare
     * @return if they compare: true, else: false
     */
    public static boolean thresholdCompare(double number, double other) {
        double epsilon = 0.000001;
        return Math.abs(number - other) < epsilon;

    }
}
