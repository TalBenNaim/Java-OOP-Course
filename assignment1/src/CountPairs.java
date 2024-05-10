// 212749071 Tal Ben Naim

/**
 * The class for task2 in assignment 1.
 * In the main method the program takes a list of integers from the user and a target.
 * Then the program returns the number of pairs.
 * pair is define as follows : if i < j and arr[i] + arr[j] < target. it's a pair.
 * (i,j in the bounds of arr length)
 * Any invalid input will notify the user.
 */
public class CountPairs {

    /**
     * This method takes a string array and turn it into int array.
     * @param arr the string array we turn into int array.
     * @return the new int array from the string array given.
     */
    public static int[] createIntArray(String[] arr) {
        // create a new array in the size of the args
        int[] newArr = new int[arr.length];

        // go through each i in the arr and parse it, if fails return null to invalidate the input.
        for (int i = 0; i < arr.length; i++) {
            try {
                newArr[i] = Integer.parseInt(arr[i]);
            } catch (NumberFormatException e) {
                // null tells the input is invalid (there is a non number character)
                return null;
            }
        }

        // return the new array
        return newArr;
    }

    /**
     * This method takes an array of number, fetch the target (which is in the last index)
     * and start to count pairs.
     * pair is define as follows : if i < j and arr[i] + arr[j] < target. it's a pair.
     * (i,j in the bounds of arr length)
     * @param arr the array to count pairs of
     * @return the number of pairs in the array
     */
    public static int countPairs(int[] arr) {
        // target is the last number in the array
        int target = arr[arr.length - 1];
        // start a counter for pairs
        int pairs = 0;

        // searches up to arr.length - 1 because we don't include the target
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                // this is the definition of pairs if it's a pair, add to the pairs counter.
                if ((i < j) && (arr[i] + arr[j] < target)) {
                    pairs++;
                }
            }
        }

        // return the number of pairs
        return pairs;
    }

    /**
     * The main method, the program takes the given args and turn it into intArray.
     * If the array contains a non number character, createIntArray will return null.
     * Then the program checks if the input is invalid and inform the user.
     * 1. arr is shorter than 2
     * 2. the array contains a non number character
     * Else, the program will count the pairs and print it to the user.
     * @param args the users input (looking for an array of numbers and a target)
     */
    public static void main(String[] args) {
        // create int array from the given args
        int[] arr = createIntArray(args);

        // Invalidate the input (arr returns null if there is a non number in args)
        if (args.length < 2 | arr == null) {
            System.out.println("Invalid input");
        } else {
            int pairs = countPairs(arr);
            System.out.println(pairs);
        }

    }
}
