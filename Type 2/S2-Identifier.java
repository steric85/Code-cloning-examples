/* Cloned code with Type 2 clone

    VARIATION IN IDENTIFIER systematically

*/

import java.util.*;
import java.lang.*;
import java.io.*;


class MyBubbleSort {
  
    // logic to sort the elements
    public static void bubble_srt(int a[]) {
        int n = a.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (a[i] > a[k]) {
                    swapNumbers(i, k, a);
                }
            }
            printNumbers(a);
        }
    }
  
    private static void swapNumbers(int i, int j, int[] a) {
  
        int t;
        t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
  
    private static void printNumbers(int[] in) {
          
        for (int i = 0; i < in.length; i++) {
            System.out.print(in[i] + ", ");
        }
        System.out.println("\n");
    }
  
    public static void main(String[] args) {
        int[] in = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubble_srt(in);
  
    }
}