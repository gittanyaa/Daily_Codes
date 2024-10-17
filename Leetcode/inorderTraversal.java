package Leetcode;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class inorderTraversal {
    public List<Integer> inorderTraversals(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderRec(root, list);
        return list;
    }

    private void inorderRec(TreeNode root, List<Integer> list) {
        if (root != null) {
            inorderRec(root.left, list);
            list.add(root.val);
            inorderRec(root.right, list);
        }
    }
}