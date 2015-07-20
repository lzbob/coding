package com.coding.string;
import com.coding.InterviewQuestion;

/**
 * Created by Rong on 7/17/15.
 */
public class StringToInte implements InterviewQuestion {
    public void doIt(){
        String s = "+643";
        int i = 0;
        int result = 0;
        boolean positive = true;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            System.out.println("ddd");
            positive = false;
            i++;

        }
        while(i < s.length()) {
            result = result *10 + (s.charAt(i) - '0');
            i++;
        }
        if (positive == false) {
            System.out.println('d');
            result = result * (-1);
        }
        System.out.println(result);


    }
}
