package bitwise;

import TimeandSpaceComplexity.recursion;

public class Arr {
    public static void main(String[] args) {
        int[] array = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6 };
        System.out.println(ans(array));
    }

    /**
     * This method finds a single element in the array that occurs only once.
     * It uses the XOR (^) operator, which has the property that a ^ a = 0 and a ^ 0
     * = a.
     * So, if we XOR all elements in the array, the elements that occur twice will
     * cancel each other out,
     * leaving only the element that occurs once.
     * 
     * @param array the input array
     * @return the single element that occurs only once
     */
    public static int ans(int[] array) {
        int uniq = 0;
        for (int n : array) {
            uniq ^= n;
        }
        return uniq;
    }
}