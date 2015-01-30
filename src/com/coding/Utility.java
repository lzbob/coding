package com.coding;

/**
 * Created by liuzhn on 1/29/15.
 */
public class Utility {

    public static void printIntArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("\n");
    }

    public static void printCharArray(char[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("\n");
    }

    public static void printStringArray(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("\n");
    }
}
