package org.example.my_task.m05_tree.m051_bfs_dfs_4_tree;

import org.junit.Assert;
import org.junit.Test;

public class TreeTest {

    @Test
    public void testSumRecursive() {
        Tree root = new Tree(20,
                new Tree(7,
                        new Tree(4,
                                null,
                                new Tree(6)),
                        new Tree(9)),
                new Tree(35,
                        new Tree(31,
                                new Tree(28),
                                null),
                        new Tree(40,
                                new Tree(38),
                                new Tree(52)))
        );
        Assert.assertEquals(270, Tree.sumRecursive(root));
    }

    @Test
    public void testSumDeep() {
        Tree root = new Tree(20,
                new Tree(7,
                        new Tree(4,
                                null,
                                new Tree(6)),
                        new Tree(9)),
                new Tree(35,
                        new Tree(31,
                                new Tree(28),
                                null),
                        new Tree(40,
                                new Tree(38),
                                new Tree(52)))
        );
        Assert.assertEquals(270, Tree.sumDeep(root));
    }

    @Test
    public void testSumBreadth() {
        Tree root = new Tree(20,
                new Tree(7,
                        new Tree(4,
                                null,
                                new Tree(6)),
                        new Tree(9)),
                new Tree(35,
                        new Tree(31,
                                new Tree(28),
                                null),
                        new Tree(40,
                                new Tree(38),
                                new Tree(52)))
        );
        Assert.assertEquals(270, Tree.sumBreadth(root));
    }
}