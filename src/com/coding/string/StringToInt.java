package com.coding.string;

import com.coding.InterviewQuestion;

import java.lang.annotation.Inherited;

/**
 * Created by liuzhn on 2/11/15.
 *
 *
 1. null or empty string
 2. white spaces
 3. +/- sign
 4. calculate real value
 5. handle min & max
 */
public class StringToInt implements InterviewQuestion {

    public void doIt() {

    }

    public int atoi(String str) {
        if(str == null)
            return 0;
        str = str.trim();
        if(str.length() == 0)
            return 0;
        boolean postive = true;
        int index = 0;
        if(str.charAt(0) == '-') {
            postive = false;
            index++;
        } else if(str.charAt(0) == '+') {
            index++;
        }
        double result = 0;
        while(index < str.length()) {
            char c = str.charAt(index);
            if(c < '0' || c > '9') {
                break;
            }
            result = result * 10 + (c - '0');
            index++;
        }
        result = postive ? result : result * -1;
        // handle max and min
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int)result;
    }
}
