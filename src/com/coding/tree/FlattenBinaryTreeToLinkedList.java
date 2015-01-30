package com.coding.tree;

import com.coding.InterviewQuestion;
import java.util.Stack;
/**
 * Created by liuzhn on 10/27/14.
 * https://oj.leetcode.com/problems/flatten-binary-tree-to-linked-list/
 * Given a binary tree, flatten it to a linked list in-place.
 */
public class FlattenBinaryTreeToLinkedList implements InterviewQuestion {

    public void doIt() {
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
