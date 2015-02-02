package com.coding;

import java.util.LinkedList;

import com.coding.DataStructure.O1DataStructure;
import com.coding.algorithms.WordLadder;
import com.coding.array.MedianTwoArray;
import com.coding.array.SortArraySmallBigSmall;
import com.coding.dp.LongestIncreasingSubsequence;
import com.coding.dp.WordBreak;
import com.coding.stack.*;
import com.coding.string.LongestPalindrome;

public class Main {

    private static LinkedList<InterviewQuestion> questions = new LinkedList();

    public static void main(String[] args) {
        //add
        questions.add(new PolishNotation());
        questions.add(new LongestPalindrome());
        questions.add(new SortArraySmallBigSmall());
        questions.add(new O1DataStructure());
        questions.add(new WordBreak());
        questions.add(new LongestIncreasingSubsequence());
        questions.add(new MedianTwoArray());
        questions.add(new WordLadder());
        // write your code here
        runLastQuestion();
    }

    private static void runLastQuestion() {
        InterviewQuestion question = questions.getLast();
        System.out.println("************** Start **************");
        question.doIt();
        System.out.println("************** End **************");
    }

    private static void runAllQuestions() {
        for(int i = 0; i < questions.size(); i++) {
            InterviewQuestion question = questions.get(i);
            System.out.println("************** Start **************");
            question.doIt();
            System.out.println("************** End **************");
        }
    }
}
