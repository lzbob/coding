package com.coding.dp;

import com.coding.InterviewQuestion;

/**
 * Created by liuzhn on 2/6/15.
 */
public class LongestCommonSubsequence implements InterviewQuestion {

    public void doIt() {
        char[] a = new char[] {'a', 'b', 'c', 'b', 'd', 'a', 'b'};
        char[] b = new char[] {'b', 'd', 'c', 'a', 'b', 'a'};
        System.out.println("Answer: " + dp(a, b));
    }

    private int dp(char[] a, char[] b) {
        int[][] results = new int[a.length + 1][b.length + 1];
        for(int i = 0; i <= a.length; i++)
            results[i][0] = 0;
        for(int j = 0; j <= b.length; j++)
            results[0][j] = 0;
        for(int i = 1; i <= a.length; i++) {
            for(int j = 1; j <= b.length; j++) {
                if(a[i-1] == b[j-1])
                    results[i][j] = results[i-1][j-1] + 1;
                else
                    results[i][j] = results[i][j-1] > results[i-1][j] ? results[i][j-1] : results[i-1][j];
            }
        }
        return results[a.length][b.length];
    }
}
