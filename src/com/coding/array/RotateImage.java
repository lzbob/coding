package com.coding.array;

import com.coding.InterviewQuestion;

/**
 * Created by liuzhn on 2/16/15.
 *
 * https://oj.leetcode.com/problems/rotate-image/
 *
 * http://www.programcreek.com/2013/01/leetcode-rotate-image-java/
 *
 * Idea:
 *
 * rotate twice:
 *
 * 1. 左右互换
 * 2. 斜线对称互换
 */
public class RotateImage implements InterviewQuestion{

    public void doIt() {

    }

    public void rotate(int[][] matrix) {
        if(matrix == null)
            return;
        if(matrix.length == 0 || matrix[0].length == 0 || matrix.length != matrix[0].length)
            return;
        int n = matrix.length;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1- j];
                matrix[i][n - 1- j] = temp;
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j=0; j < n -i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][n-i-1];
                matrix[n-j-1][n-i-1] = temp;
            }
        }
    }
}
