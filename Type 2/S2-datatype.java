/* Cloned code with Type 2 clone

    VARIATION IN IDENTIFIER DATATYPE

*/

import java.util.*;
import java.lang.*;
import java.io.*;


class MyBubbleSort {
  
    // logic to sort the elements
    public static void bubble_srt(double array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }
  
    private static void swapNumbers(int i, int j, double[] array) {
  
        double temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
  
    private static void printNumbers(double[] input) {
          
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
  
    public static void main(String[] args) {
        double[] input = { 4.0, 2.0, 9.0, 6.0, 23.0, 12.0, 34.0, 0.0, 1.0 };
        bubble_srt(input);
  
    }
}