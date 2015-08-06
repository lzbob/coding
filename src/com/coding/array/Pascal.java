package com.coding.array;

import com.coding.InterviewQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rong on 8/4/15.
 */
public class Pascal implements InterviewQuestion {
    public void doIt() {
        int i = 5;
        ArrayList<ArrayList<Integer>> result = generate(i);
        for(ArrayList<Integer> row : result) {
            for(Integer v : row) {
                System.out.print(v + ",");
            }
            System.out.println(",");
        }
    }


    public ArrayList<ArrayList<Integer>>generate(int numRows) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i = 1; i <= numRows; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for(int j = 0; j < i; j++) {
                if(j == 0 || j == i - 1) {
                    row.add(1);
                } else {
                    ArrayList<Integer> prevRow = result.get(i - 2);
                    row.add(prevRow.get(j) + prevRow.get(j-1));
                }
            }
            result.add(row);
        }
        return result;
    }

}
