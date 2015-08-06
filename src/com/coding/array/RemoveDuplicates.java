package com.coding.array;

import com.coding.InterviewQuestion;
import java.util.Arrays;

/**
 * Created by liuzhn on 2/16/15.
 *
 * https://oj.leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * http://www.programcreek.com/2013/01/leetcode-remove-duplicates-from-sorted-array-java/
 * 
 */
public class RemoveDuplicates implements InterviewQuestion {

    public void doIt() {
        int[] arr = new int[] {2,3,3,3,4,4,5,6,7,7,8};
        System.out.println(Arrays.toString(arr));
        int[] result = removeDup(arr);
        System.out.println(Arrays.toString(result));

    }
    private int[] removeDup(int[] arr) {
        int i = 0;
        int j = 1;
        int len = arr.length;
        for (i = 0; i < len; i++) {
            if(arr[i] == arr[j]) {
                j++;
            }
        }
        return arr;
    }

    public int removeDuplicates(int[] A) {
        if(A == null || A.length == 0)
            return 0;
        if(A.length == 1)
            return 1;
        int index = 0;
        int next = 1;
        while(next < A.length) {
            if(A[next] != A[index]) {
                index++;
                A[index] = A[next];
                next++;
            } else {
                next++;
            }
        }
        return index + 1;
    }
}
