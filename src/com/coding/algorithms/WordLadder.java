package com.coding.algorithms;

import com.coding.InterviewQuestion;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by liuzhn on 2/1/15.
 *
 * Given two words (start and end), and a dictionary, find the length of shortest transformation sequence from start to end, such that:

 Only one letter can be changed at a time
 Each intermediate word must exist in the dictionary
 For example,

 Given:
 start = "hit"
 end = "cog"
 dict = ["hot","dot","dog","lot","log"]
 As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 return its length 5.

 Note:
 Return 0 if there is no such transformation sequence.
 All words have the same length.
 All words contain only lowercase alphabetic characters.
 */
/*
    Looks like a tree, use BFS to find the lowest child tree
 */
public class WordLadder implements InterviewQuestion {

    public void doIt() {
        String start = "hit";
        String end = "cog";
        Set<String> dict = new HashSet<String>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");
        System.out.println(findIt(start, end, dict));
    }

    private int findIt(String start, String end, Set<String> dict) {
        LinkedList<String> wordQueue = new LinkedList<String>();
        LinkedList<Integer> distanceQueue = new LinkedList<Integer>();

        wordQueue.add(start);
        distanceQueue.add(1);

        while(!wordQueue.isEmpty()) {
            String currentWord = wordQueue.pop();
            int currentDistance = distanceQueue.pop();

            for(int i = 0; i < currentWord.length(); i++) {
                char[] temp = currentWord.toCharArray();
                for (char c = 'a'; c <= 'z'; c++) {
                    temp[i] = c;
                    String newWord = new String(temp);
                    if(newWord.equals(end))
                        return currentDistance+1;
                    if(dict.contains(newWord)) {
                        wordQueue.add(newWord);
                        distanceQueue.add(currentDistance + 1);
                        dict.remove(newWord);
                    }
                }
            }
        }
        return 0;
    }
}
