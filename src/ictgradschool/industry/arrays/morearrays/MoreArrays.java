package ictgradschool.industry.arrays.morearrays;

import java.util.Arrays;
/**
 * Complete the following methods based on the comments.
 * You can run the tests to check your answers.
 *
 */

public class MoreArrays {

    /** A. Complete the method getPairSumTo() that takes two parameters, an
     * integer array and an integer number. The method will then return a
     * String containing two numbers where the sum of the two numbers is equal
     * to the given integer number (from the parameter). The number will be
     * in ascending order and separated by ", ". For example,
     * 		getPairSumTo(new int[] {1, 2, 3, 4, 5, 6}, 10)
     * will return the following:
     * 		"4, 6"
     * If the method cannot find the right numbers for the sum, the method
     * will print "0" instead. If the integer array has less than 2 elements,
     * the method will also print "0".
     *
     * @param addends An array of integers that may be used as addends for
     *                the target sum.
     * @param targetSum The sum we are attempting to generate from available
     *                  addends.
     * @return A String containing the two integers that add the to target
     *         sum or "0".
     */
    public String getPairSumTo(int[] addends, int targetSum) {
        // TODO write statements here
        int i = 0;
        int j = 0;


        if (addends.length < 2)
            return "0";
        else  {
            for (i = 0; i < addends.length; i++) {
                for (j = i + 1; j < addends.length; j++) {
                    if (addends[i] + addends[j] == targetSum)
                        return String.valueOf(Math.min(addends[i],addends[j]) )+ ", " + String.valueOf(Math.max(addends[1],addends[j]));

                }

            }
            return "0";
        }

    }


    /** getPairSumTo(int[], int) => String **/


    /** B. Write a method removeDuplicates() that removes duplicate
     * elements from a given string array and returns the array of unique
     * elements. Order must not be changed. For example:
     *     removeDuplicates(new String[] {"abc", "123", "abc"})
     *
     * will return the following (as a String array):
     *     {"abc", "123"}
     *
     * @param stringValues An array of String values
     * @return A String array containing only the unique values of the input
     *         array
     */
    public String[] removeDuplicates(String[] stringValues) {

        int lens;
        String [] removeduplicates = null;
       for (int i = 0; stringValues.length > i; i++) {
           for (int j = i + 1; j < stringValues.length; j++) {
               for (i = null)

               if (stringValues[i].equals(stringValues[j]))
               {
                   stringValues[j] = null;
               }
           }
       }

        String[] removeduplicates =
                return removeduplicates;
       }



    public String[] removeDuplicates(String[] stringValues) {
        int len = 0;
        for (int i = 0; i < stringValues.length; i++) {
            if (stringValues[i] != null) {
                len++;
                for (int j = i+1; j < stringValues.length; j++) {
                    if (stringValues[i].equals(stringValues[j])) {
                        stringValues[j] = null;
                    }
                }
            }

        }
        String[] removed = new String[len];
        int curr = 0;
        for (int k = 0; k < stringValues.length; k++) {
            if (stringValues[k] != null) {
                removed[curr] = stringValues[k];
                curr++;
            }
        }
        return removed;
    }

    /** removeDuplicates(String[]) => String[] **/







    /** C. Write a method findCommonNumbers() that returns an array of
     * the common elements between two integer arrays. The common numbers
     * must remain in the order that they are encountered in the first
     * array. For example:
     *     findCommonNumbers(new int[] {1, 2, 3, 4, 5},
     *                       new int[] {6, 7, 8, 9, 2, 4})
     *
     * will return the common elements (as an integer array):
     *     {2, 4}
     *
     * If there are no common elements, the method will return an empty
     * array, such as:
     *     {}
     *
     * Do *not* use Arrays or Collection library methods.
     *
     * @param arrayOne The first array of integers
     * @param arrayTwo The second array of integers
     * @return An array of integers that are common to both given arrays
     */
    public int[] findCommonNumbers(int[] arrayOne, int[] arrayTwo){
        // TODO write statements here




        return null;
    }
    /** findCommonNumbers(int[], int[]) => int[] **/


    /** D. Write a method convertIntToBinary that converts a given positive
     * integer to the binary format. The method will return the binary as a
     * String. For example:
     *     convertIntToBinary(4)
     *
     * will return the following:
     *     "100"
     *
     * @param toConvert An integer to convert to binary
     * @return the binary representation of the given number as a String
     */
    public String convertIntToBinary(int toConvert){
        // TODO write statements here
        return null;
    }
    /** convertIntToBinary(int) => String **/


}
