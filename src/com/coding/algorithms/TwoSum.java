package com.coding.algorithms;
import com.coding.InterviewQuestion;


/**
 * Created by Rong on 7/15/15.
 */
public class TwoSum implements InterviewQuestion {
    public void doIt() {
        int[] arr1 = new int[]{1, 3, 4, 7, 8, 9, 12};
        int num = 8;
        int i = 0;
        int j = arr1.length - 1;
        while(i<j) {
            if ((arr1[i] + arr1[j] )==num){
                System.out.println(arr1[i] + "," + arr1[j]);
                break;
            } else if ((arr1[i] + arr1[j] )<num) {
                i++;
            } else if ((arr1[i] + arr1[j] )>num) {
                j--;
            }
        }

    }
}

