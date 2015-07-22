package com.coding.string;
import com.coding.InterviewQuestion;

/**
 * Created by Rong on 7/20/15.
 */
public class LengthOfLastWord implements InterviewQuestion{
    public void doIt() {
        String s = "abd dASd aab";
        int len = s.length();
        int result = 0;
        int i;
        for(i = len-1; i >= 0; i--) {
            if((s.charAt(i)> 'a' && s.charAt(i)< 'z') || (s.charAt(i)> 'A' && s.charAt(i)< 'Z')) {
                result++;
                System.out.println(result);
            } else {
                System.out.println(result);
                return;
            }
        }
        System.out.println(result);
    }
}
