package com.coding.string;

import com.coding.InterviewQuestion;

/**
 * Created by liuzhn on 2/11/15.
 *
 * http://www.programcreek.com/2012/12/leetcode-implement-strstr-java/
 */
public class subStr implements InterviewQuestion {

    public void doIt() {

    }

    public int strStr(String haystack, String needle) {
        int needleLen = needle.length();
        int haystackLen = haystack.length();

        if (needleLen == haystackLen && needleLen == 0)
            return 0;

        if (needleLen == 0)
            return 0;

        for(int i = 0; i < haystackLen; i++) {
            if(haystackLen - i < needleLen)
                return -1; //exceed
            for(int j = 0; j < needleLen; j++) {
                if(haystack.charAt(i+j) != needle.charAt(j))
                    break;
                if(j == needleLen -1)
                    return i;
            }
        }
        return -1;
    }
}
