package com.coding.dp;

import com.coding.InterviewQuestion;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by liuzhn on 1/30/15.
 * Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

 For example, given
 s = "leetcode",
 dict = ["leet", "code"].

 Return true because "leetcode" can be segmented as "leet code".
 */
public class WordBreak implements InterviewQuestion{

    public void doIt() {
        Set<String> dict = new HashSet<String>();
        dict.add("leet");
        dict.add("code");
        dict.add("tc");
        String s = "leetcode";
        wordBreak(s, dict);
    }

    private void wordBreak(String s, Set<String> dict) {
        if(bruteForce(s, dict, 0))
            System.out.println("Found");
        else
            System.out.println("Not Found");
        if(dp(s, dict))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }

    //o(n^2)
    private Boolean bruteForce(String s, Set<String> dict, int start) {
        if(start == s.length())
            return true;

        for(String a: dict){
            int len = a.length();
            int end = start+len;

            //end index should be <= string length
            if(end > s.length())
                continue;

            if(s.substring(start, start+len).equals(a))
                if(bruteForce(s, dict, start + len))
                    return true;
        }

        return false;
    }

    private Boolean dp(String s, Set<String> dict) {
        boolean[] t = new boolean[s.length()+1];
        t[0] = true; //set first to be true, why?
        //Because we need initial state

        for(int i=0; i<s.length(); i++){
            //should continue from match position
            if(!t[i])
                continue;

            for(String a: dict){
                int len = a.length();
                int end = i + len;
                if(end > s.length())
                    continue;

                if(t[end]) continue;

                if(s.substring(i, end).equals(a)){
                    t[end] = true;
                }
            }
        }

        return t[s.length()];
    }
}
