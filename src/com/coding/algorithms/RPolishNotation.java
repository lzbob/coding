package com.coding.algorithms;
import com.coding.InterviewQuestion;

import java.util.*;

/**
 * Created by Rong on 7/15/15.
 */
public class RPolishNotation implements InterviewQuestion {
    public void doIt() {
        String[] arr1 = new String[]{"2", "1", "+", "3", "*"};
        Stack<String> stack = new Stack<String>();
        //Stack<String> stack = new Stack<String>();
        String operators = "+-*/";
        for (String i : arr1) {
            if (!operators.contains(i)) {
                stack.push(i);
            } else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                switch (i) {
                    case "+": {
                        stack.push(String.valueOf(a + b));
                        break;
                    }
                    case "-": {
                        stack.push(String.valueOf(a - b));
                        break;
                    }
                    case "*": {
                        stack.push(String.valueOf(a * b));
                        break;
                    }
                    case "/": {
                        stack.push(String.valueOf(a / b));
                        break;
                    }
                }
            }
        }
        int returnValue = 0;
        returnValue = Integer.valueOf(stack.pop());
        System.out.println(Arrays.toString(arr1));

    }
}