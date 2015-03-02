package com.coding.dp;

import com.coding.InterviewQuestion;

/**
 * Created by liuzhn on 2/6/15.
 */
public class ClimbStairs implements InterviewQuestion {

    public void doIt() {
        System.out.println("Answer: " + dp(5));
    }

    private int dp(int n) {
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        int[] steps = new int[n + 1];
        steps[1] = 1;
        steps[2] = 2;
        for(int i = 3; i < (n +  1); i++) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }
        return steps[n];
    }
}
