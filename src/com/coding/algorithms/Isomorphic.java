package com.coding.algorithms;
import com.coding.InterviewQuestion;

import java.util.HashMap;

/**
 * Created by Rong on 7/22/15.
 */
public class Isomorphic implements InterviewQuestion{
    public void doIt() {
        ifIsomorphic("qxyyabb", "aaggpdd");
    }

    public void ifIsomorphic(String s1, String s2) {
        boolean result = true;
        if(s1.length() != s2.length() || s1.length() == 0 || s2.length() == 0) {
            result = false;
            System.out.println(result);
            return;
        } else {
            HashMap<Character, Character> map = new HashMap<Character, Character>();
            for( int i = 0; i < s1.length(); i++) {
                char char1 = s1.charAt(i);
                char char2 = s2.charAt(i);
                if (map.containsKey(char1)) {
                    if (map.get(char1) != char2) {
                        result = false;
                        System.out.println(result);
                        return;
                    }
                } else {
                    if (!map.containsValue(char2)) {
                        map.put(char1, char2);
                    } else {
                        result = false;
                        System.out.println(result);
                        return;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
