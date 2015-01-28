package com.coding.string;

import com.coding.InterviewQuestion;

/**
 * Created by liuzhn on 1/28/15.
 * http://www.programcreek.com/2013/12/leetcode-solution-of-longest-palindromic-substring-java/
 * Solution:
 * 1. have a helper function, return the longest palindrome (string, begin, end)
 * 2. start each index in the given string, call helper, get the longest
 */
public class LongestPalindrome implements InterviewQuestion {

    public void printQuestion() {
        System.out.println("Find longest palindromic substring");
    }

    public void printSolution() {
        this.findLongestPalindrome("cgakdjasdkcbakjcbaskcbjbsadh");
    }

    private void findLongestPalindrome(String str) {
        String longest = "";
        for(int i = 0; i < str.length(); i++) {
            // get longest palindrome with center of i
            String tmp = helper(str, i, i);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }

            // get longest palindrome with center of i, i+1
            tmp = helper(str, i, i + 1);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
        }
        System.out.println("Longest:" + longest);
    }

    private String helper(String str, int start, int end) {
        while(start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
            start--;
            end++;
        }
        return str.substring(start + 1, end);
    }
}
