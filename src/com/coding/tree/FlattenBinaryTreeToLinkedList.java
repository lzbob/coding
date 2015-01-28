package com.coding.tree;

import com.coding.InterviewQuestion;
import java.util.Stack;
/**
 * Created by liuzhn on 10/27/14.
 */
public class FlattenBinaryTreeToLinkedList implements InterviewQuestion {

    public void printQuestion() {
        System.out.println("Given a binary tree, flatten it to a linked list in-place.");
        System.out.println("https://oj.leetcode.com/problems/flatten-binary-tree-to-linked-list/");
    }

    public void printSolution() {
        System.out.println("Go down through the left, when right is not null, push right to stack.");
    }

    public void resolove(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        while(p != null || !stack.empty()){

            if(p.right != null){
                stack.push(p.right);
            }

            if(p.left != null){
                p.right = p.left;
                p.left = null;
            } else if(!stack.empty()){
                TreeNode temp = stack.pop();
                p.right=temp;
            }

            p = p.right;
        }
    }
}
