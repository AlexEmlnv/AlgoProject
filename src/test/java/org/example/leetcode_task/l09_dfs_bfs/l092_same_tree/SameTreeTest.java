package org.example.leetcode_task.l09_dfs_bfs.l092_same_tree;

import org.junit.Assert;
import org.junit.Test;

public class SameTreeTest {

    @Test
    public void isSameTreeWith1Example() {
        SameTree validator = new SameTree();
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        TreeNode q = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        Assert.assertTrue(validator.isSameTree(p, q));
    }

    @Test
    public void isSameTreeWith2Example() {
        SameTree validator = new SameTree();
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                null);
        TreeNode q = new TreeNode(1,
                null,
                new TreeNode(2));
        Assert.assertFalse(validator.isSameTree(p, q));
    }

    @Test
    public void isSameTreeWith3Example() {
        SameTree validator = new SameTree();
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(1));
        TreeNode q = new TreeNode(1,
                new TreeNode(1),
                new TreeNode(2));
        Assert.assertFalse(validator.isSameTree(p, q));
    }
}