package com.coding.algorithms;

import com.coding.InterviewQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by liuzhn on 2/9/15.
 */
public class MinimumWindowSubstring implements InterviewQuestion {

    public void doIt() {
        System.out.println(find("a", "a"));
    }

    private String find(String S, String T) {
        if(S.length() * T.length() == 0)
            return "";
        HashMap<Character, Integer> map = new HashMap();
        HashMap<Character, Integer> found = new HashMap();
        int foundNumber = 0;
        for(int i = 0; i < T.length(); i++) {
            found.put(T.charAt(i), 0);
            int n = map.get(T.charAt(i)) == null ? 1 : ( map.get(T.charAt(i)) + 1);
            map.put(T.charAt(i), n);
        }
        //two pointers
        int start = 0;
        int end = 0;
        int min = S.length() + 1;
        String minStr = "";
        while(end < S.length()) {
            char c = S.charAt(end);
            if(map.containsKey(c)) {
                if(found.get(c) < map.get(c)) {
                    foundNumber++;
                }
                found.put(c, found.get(c) + 1);
                if(foundNumber == T.length()) {
                    while(start < S.length() && foundNumber == T.length()) {
                        char c1 = S.charAt(start);
                        if(map.containsKey(c1)) {
                            found.put(c1, found.get(c1) - 1);
                            if(found.get(c1) < map.get(c1)) {
                                foundNumber--;
                            }
                        }
                        start++;
                    }
                    int currentMin = end - start + 2;
                    if(currentMin < min) {
                        minStr = S.substring(start - 1, end + 1);
                        min = minStr.length();
                        System.out.println(minStr + " Current:" + currentMin + " min:" + min);
                    }
                }
            }
            end++;
        }
        return minStr;
    }

}
