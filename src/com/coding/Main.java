package com.coding;

import java.util.LinkedList;

import com.coding.stack.*;
import com.coding.string.LongestPalindrome;

public class Main {

    private static LinkedList<InterviewQuestion> questions = new LinkedList();

    public static void main(String[] args) {
        //add
        questions.add(new PolishNotation());
        questions.add(new LongestPalindrome());
        // write your code here
        runLastQuestion();
    }

    private static void runLastQuestion() {
        InterviewQuestion question = questions.getLast();
        System.out.println("************** Start **************");
        question.printQuestion();
        question.printSolution();
        System.out.println("************** End **************");
    }

    private static void runAllQuestions() {
        for(int i = 0; i < questions.size(); i++) {
            InterviewQuestion question = questions.get(i);
            System.out.println("************** Start **************");
            question.printQuestion();
            question.printSolution();
            System.out.println("************** End **************");
        }
    }
}
