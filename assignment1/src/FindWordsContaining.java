// 212749071 Tal Ben Naim

/**
 * The class for task3 in assignment 1.
 * In the main method the program takes a list of words from the user and a target char.
 * Then the program prints the words that contains the target char.
 * Any invalid input will notify the user.
 */
public class FindWordsContaining {

    /**
     * This method check if the target is char, the target is located in the last index.
     * @param arr the array where the target is
     * @return ture if the target is char and false if isn't
     */
    public static boolean checkIfTargetIsChar(String[] arr) {
        // the arr is empty, so the target can't be checked
        if (arr.length == 0) {
            return false;
        } else {
            // length of the last string of the array is 1 if a char.
            return arr[arr.length - 1].length() == 1;
        }
    }

    /**
     * This method check is the given target is in the given word.
     * @param str the given word
     * @param target the given target
     * @return true if it is and false if isn't
     */
    public static boolean isTargetInWord(String str, char target) {
        // transform the string into an array of chars
        char[] charsInStr = str.toCharArray();

        // loop through each char in the string and look for the target, ignoring the target.
        for (int i = 0; i < charsInStr.length - 1; i++) {
            // the target is found, return true
            if (charsInStr[i] == target) {
                return true;
            }
        }

        // the program didn't find the target in the word, return false.
        return false;
    }

    /**
     * This method takes all the words to print into the array.
     * Which words to print? those who contains the target.
     * @param arr the array of words
     * @return a new array with the words to print
     */
    public static String[] wordsToPrint(String[] arr) {
        // we print the words that contain our target
        String[] newArr = new String[arr.length];
        // the target is the char in the last index of the arr (it's only a char hence the index 0)
        char target = arr[arr.length - 1].charAt(0);

        // add all the words that contain the target, without the target
        for (int i = 0; i < arr.length - 1; i++) {
            if (isTargetInWord(arr[i], target)) {
                newArr[i] = arr[i];
            } else {
                // place empty spaces in index not to print
                newArr[i] = "";
            }
        }

        // return the newArr of the words to print
        return newArr;
    }

    /**
     * This method get an array and prints it to the user.
     * @param arr the array to print
     */
    public static void printArray(String[] arr) {
        // loop through the array and print each element, ignore the target and the empty spaces (tells not to print)
        for (int i = 0; i < arr.length - 1; i++) {
            // if the index isn't empty, it's valid and should be printed.
            if (!arr[i].isEmpty()) {
                System.out.println(arr[i]);
            }
        }
    }

    /**
     * This is the main method, here the program gets the args which should contain words and a target char.
     * The program validate the args and inform the user if it's invalid.
     * Then the program passes the args through  a method to find which words to print.
     * Lastly prints those words using printArray.
     * @param args The user's input (looking for an array of words and a target char)
     */
    public static void main(String[] args) {
        // Look for invalid inputs , shorter than 2 and the last isn't char.
        if (args.length < 2 | !checkIfTargetIsChar(args)) {
            System.out.println("Invalid input");
        } else {
            String[] newArr = wordsToPrint(args);
            printArray(newArr);
        }
    }
}
