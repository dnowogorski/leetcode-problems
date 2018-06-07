package com.dnowogorski.merge_two_binary_tries;

public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;

        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    static TreeNode node(int val, TreeNode left, TreeNode right) {
        TreeNode node = new TreeNode(val);
        node.left = left;
        node.right = right;
        return node;
    }

    static TreeNode root(int val) {
        return node(val, null, null);
    }

    static TreeNode left(int val, TreeNode left) {
        return node(val, left, null);
    }

    static TreeNode right(int val, TreeNode right) {
        return node(val, null, right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}