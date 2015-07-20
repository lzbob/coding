package com.coding.array;
import com.coding.InterviewQuestion;
/**
 * Created by Rong on 7/16/15.
 */
public class ThreeSum implements InterviewQuestion{
    public void doIt() {
        int[] arr1 = new int[]{1, 3, 4, 6, 7, 8, 9, 12, 16, 19};
        int num = 16;
        int j;
        for (int i= 0 ; i< arr1.length-2; i++) {
            int k = arr1.length - 1;
            j = i+1;
            while(j<k) {
                if ((arr1[i] + arr1[j] + arr1[k] )==num){
                    System.out.println(arr1[i] + ", " + arr1[j] + ", " +arr1[k]);
                    k--;
                   //break;
                } else if ((arr1[i] + arr1[j] + arr1[k] )<num) {
                    j++;
                } else if ((arr1[i] + arr1[j] + arr1[k] )>num) {
                    k--;
                }
            }
        }


    }

    /*
    find there sum closest to a given number
     */
//    public void doIt() {
//        int[] arr1 = new int[]{1, 4, 6, 7, 9, 12, 16, 19};
//        int num = 13;
//        int sum = 0;
//        int result = 0;
//        int temp = 100;
//        int j;
//        int k = arr1.length - 1;
//        for (int i= 0 ; i< arr1.length-2; i++) {
//            j = i+1;
//            while(i<(k-2)) {
//                sum = arr1[i] + arr1[j] + arr1[k];
//                result = sum - num;
//                if (result == 0){
//                    System.out.println(arr1[i] + ", " + arr1[j] + ", " +arr1[k]);
//                    break;
//                } else if (result < 0) {
//                    j++;
//                } else if (result > 0) {
//                    k--;
//                }
//
//                if (temp>result) {
//                    temp = result;
//                }
//
//            }
//        }
//        System.out.println("result is " + result);
//
//
//    }
}
