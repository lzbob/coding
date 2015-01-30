package com.coding.array;

import com.coding.InterviewQuestion;
import com.coding.Utility;

/**
 * Created by liuzhn on 1/29/15.
 * Question:
 * Sort array, make it like: s1 <= s2 >= S3 <= S4 >= S5
 */
public class SortArraySmallBigSmall implements InterviewQuestion {

    public void doIt() {
        int[] arr = new int[] {3,6,4,51,2};
        int[] result = sort(arr);
        Utility.printIntArray(result);
    }

    private int[] sort(int[] arr) {
        int[] results = new int[arr.length];
        int start = 0;
        int end = arr.length - 1;
        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                if(arr[start] <= arr[end]) {
                    results[i] = arr[start++];
                } else {
                    results[i] = arr[end--];
                }
            } else {
                if(arr[start] > arr[end]) {
                    results[i] = arr[start++];
                } else {
                    results[i] = arr[end--];
                }
            }
        }
        return results;
    }
}
