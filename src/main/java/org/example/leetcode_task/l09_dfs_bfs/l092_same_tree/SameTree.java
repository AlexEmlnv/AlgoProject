package org.example.leetcode_task.l09_dfs_bfs.l092_same_tree;

import java.util.List;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> pList = TreeNode.convertToList(p);
        List<Integer>  qList = TreeNode.convertToList(q);
        return pList.equals(qList);
    }
}
