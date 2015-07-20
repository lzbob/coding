package com.coding.algorithms;
import com.coding.InterviewQuestion;
/**
 * Created by Rong on 7/16/15.
 */
public class LongPanlin implements InterviewQuestion{
    public void doIt(){
        String target = "abaccabc";
        String result = "";
        for (int i = 0; i < target.length(); i++) {
            String temp = findP(target, i, i);
            if(temp.length() > result.length()) {
                result = temp;
            }
            temp = findP(target, i, i+1);
            if(temp.length() > result.length()) {
                result = temp;
            }
        }

        System.out.println("longest is :" + result);
    }

    private String findP(String s, int startIndex, int endIndex) {
        String longest = "";
        while (startIndex>=0 && endIndex<s.length() && s.charAt(startIndex)==s.charAt(endIndex)) {
            longest = s.substring(startIndex, endIndex+1);
            startIndex--;
            endIndex++;
        }
        return longest;
    }
}
