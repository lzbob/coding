package com.coding.array;

import com.coding.InterviewQuestion;
import com.coding.Utility;
/**
 * Created by rong0510 on 3/1/15.
 */
public class PeakElement implements InterviewQuestion {

    public void doIt() {
        int[] arr = new int[] {67,6,4,51,299};
        int result = findPeakElement(arr);
        System.out.println(result);
    }

    private int findPeakElement(int[] arr) {
        int max = 0;
        if (arr[0]> arr[arr.length-1]) {
            max = arr[0];
        } else {
            max = arr[arr.length-1];
        }
        for (int i = 1; i < arr.length - 1; i ++) {
            if (arr[i] > arr[i+1] && arr[i-1] < arr[i] && arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
