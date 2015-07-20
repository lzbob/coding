package com.coding.algorithms;

import com.coding.InterviewQuestion;

import java.util.Arrays;

/**
 * Created by Rong on 7/14/15.
 */
public class RotateArray implements InterviewQuestion {
    public void doIt() {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr1.length - 1;
        int step = 3;
        int s = step - 1;
        reverse(arr1, 0, s);
        reverse(arr1, step, n);
        reverse(arr1, 0, n);
        System.out.println(Arrays.toString(arr1));

    }

    private int reverse(int[] arr, int startA, int endA){
        int temp;
        while (startA < endA) {
            temp = arr[startA];
            arr[startA] = arr[endA];
            arr[endA] = temp;
            startA++;
            endA--;

        }
        return 1;
    }
}
