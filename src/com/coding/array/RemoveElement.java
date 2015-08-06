package com.coding.array;

import com.coding.InterviewQuestion;

import java.util.Arrays;

/**
 * Created by rong0510 on 3/1/15.
 */
public class RemoveElement implements InterviewQuestion {

    public void doIt() {
        int[] arr = new int[] {4,51,3,3,6,3,299};
        int target = 3;
        System.out.println(Arrays.toString(arr));
        int[] result = removeElement(arr, target);
        System.out.println(Arrays.toString(result));

    }

    private int[] removeElement(int[] arr, int target) {
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                continue;
            }
            //System.out.println(i);
            arr[j] = arr[i];
            j++;
        }
        return Arrays.copyOfRange(arr, 0, j);
    }

}
