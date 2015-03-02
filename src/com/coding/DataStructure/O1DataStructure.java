package com.coding.DataStructure;

import com.coding.InterviewQuestion;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by liuzhn on 1/29/15.
 * Question: insert, remove, contains, get random element, all at O(1)
 *
 * Idea:
 * array and hashmap
 *
 */
public class O1DataStructure implements InterviewQuestion {

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int currentIndex = 0;

    public void doIt() {
        insert(1);
        insert(3);
        insert(5);
        remove(3);
        insert(4);
        for (Integer key: map.keySet()){
            System.out.print(key + ",");
        }
        System.out.print("\n");
        for(int i = 0; i < currentIndex; i++) {
            System.out.print(arr.get(i) + ",");
        }
        System.out.print("\n");
    }

    private void insert(int value) {
        arr.add(currentIndex, value);
        map.put(value, currentIndex);
        currentIndex++;
    }

    private void remove(int value) {
        if(map.containsKey(value)) {
            int targetIndex = map.get(value);
            map.remove(value);
            arr.set(targetIndex, arr.get(currentIndex - 1));
            map.put(arr.get(currentIndex - 1), targetIndex);
            currentIndex--;
        }
    }

}
