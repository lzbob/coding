package com.coding.stack;

import com.coding.InterviewQuestion;

import java.util.Stack;

/**
 * Created by liuzhn on 1/27/15.
 * http://www.programcreek.com/2012/12/leetcode-evaluate-reverse-polish-notation/
 */
public class PolishNotation implements InterviewQuestion{

    public void printQuestion() {
        System.out.println("Evaluate Reverse Polish Notation");
        System.out.println("Example:  [\"2\", \"1\", \"+\", \"3\", \"*\"] -> ((2 + 1) * 3) -> 9");
        System.out.println("Example: [\"4\", \"13\", \"5\", \"/\", \"+\"] -> (4 + (13 / 5)) -> 6");
    }

    public void doIt() {
        String[] tokens = new String[] {"2", "1", "+", "3", "*"};
        int result = evalPolishNotation(tokens);
        if(result == 9)
            System.out.println("Passed");
        else
            System.out.println("Failed, result = " + result);
    }

    private int evalPolishNotation(String[] tokens) {
        int returnValue = 0;
        if(tokens.length == 0) {
            System.out.println("Invalid input");
            return -1;
        }
        Stack<String> stack = new Stack<String>();
        String operations = "+-*/";
        String numbers = "0123456789";
        for(String t : tokens) {
            if(!operations.contains(t)) {
                //check if it is a valid number
                if(!numbers.contains(t)) {
                    System.out.println("Invalid input");
                } else {
                    stack.push(t);
                }
            } else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                int index = operations.indexOf(t);
                switch (index) {
                    case 0:
                        stack.push(String.valueOf(a + b));
                        break;
                    case 1:
                        stack.push(String.valueOf(a - b));
                        break;
                    case 2:
                        stack.push(String.valueOf(a * b));
                        break;
                    case 3:
                        stack.push(String.valueOf(a / b));
                        break;
                }

            }
        }
        returnValue = Integer.valueOf(stack.pop());
        System.out.println("5");
        

        return returnValue;
    }
}
