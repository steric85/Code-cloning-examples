/* Cloned code with Type 4 clone

    REORDER DATA DEPENDENT 

    will give incorrect output
*/

import java.util.*;
import java.lang.*;
import java.io.*;


class MyBubbleSort {
  
    // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k=0;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
                k = i + 1;
            }
            printNumbers(array);
        }
    }
  
    private static void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[j] = temp;
        array[i] = array[j];
    }
  
    private static void printNumbers(int[] input) {
          
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
  
    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubble_srt(input);
  
    }
}