package com.coding.array;

import com.coding.InterviewQuestion;

/**
 * Created by liuzhn on 2/12/15.
 * https://oj.leetcode.com/problems/search-insert-position/
 *
 * http://www.programcreek.com/2013/01/leetcode-search-insert-position/
 */
public class SearchInsertPosition implements InterviewQuestion {

    public void doIt() {

    }

    public int searchInsert(int[] A, int target) {
        if(A == null || A.length == 0 || target <= A[0])
            return 0;
        return find(A, target, 0, A.length - 1);
    }

    private int find(int[] A, int target, int start, int end) {
        int middle = (end + start)/2;
        if(A[middle] == target)
            return middle;
        else if(A[middle] > target)
            return start < middle ? find(A, target, start, middle -1) : start;
        else
            return end > middle ? find(A, target, middle + 1, end) : end + 1;
    }
}
