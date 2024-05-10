// 212749071 Tal Ben Naim

/**
 * The class for task1 in assignment 1.
 * In the main method the program takes an integer from the user
 * and passes it to a recursive method (sumDigits)
 * to find the sum of the digits of the given integer.
 */
public class SumOfInteger {

    /**
     * sumDigits is a recursive function to sum the digits of number.
     * @param number the number to sum the digits of.
     * @return sum of the digits of the given number.
     */
    public static int sumDigits(int number) {
        // get the digit from the number
        int digit = number % 10;

        // exit case: when the number is a single digit we return itself and stop the recursion
        if (number / 10 == 0) {
            return digit;
        } else {
            return digit + sumDigits(number / 10);
        }

    }

    /**
     * The main method, it takes a number through the args and tries to parse it.
     * If the parse fail it return Invalid Input
     * Else it passes the number to sumDigits and print the result.
     * @param args the user's input (looking for a number)
     */
    public static void main(String[] args) {
        // try to parse the number from args, a single number so [0] place.
        try {
            int number = Integer.parseInt(args[0]);
            // pass the number absolute value to sumDigits, then print the result
            int result = sumDigits(Math.abs(number));
            System.out.println(result);

            // catching these exceptions to invalidate an input (the args is empty or isn't a number)
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input");
        }
    }
}
