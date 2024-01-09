package org.example.leetcode_task.l09_dfs_bfs.l092_same_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static List<Integer> convertToList(TreeNode root){
        List<Integer>  resList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            TreeNode curr = stack.pop();
            resList.add(curr != null ? curr.val : null);
            if (curr != null) {
                stack.push(curr.right);
                stack.push(curr.left);
            }
        }
        return resList;
    }
}
