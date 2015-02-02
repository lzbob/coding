package com.coding.dp;

import com.coding.InterviewQuestion;

/**
 * Created by liuzhn on 1/30/15.
 * find LongestIncreasingSubsequence
 * d(i) = max{1, d(j)+1},其中j<i,A[j]<=A[i]
 */
public class LongestIncreasingSubsequence implements InterviewQuestion {

    public void doIt() {
        int[] arr = new int[] {5, 3, 4, 8, 6, 7};
        System.out.println("Result: " + solution(arr));
    }

    private int solution(int[] arr) {
        int length = 1;
        int[] d = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            d[i] = 1;
            for(int j = 0; j < i; j++) {
                if(arr[j] < arr[i] && d[j] + 1 > d[i]) {
                    d[i] = d[j] + 1;
                }
            }
            if(d[i] > length)
                length = d[i];
        }
        return length;
    }
}
