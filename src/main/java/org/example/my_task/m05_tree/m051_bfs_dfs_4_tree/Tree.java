package org.example.my_task.m05_tree.m051_bfs_dfs_4_tree;

import java.util.*;

public class Tree {
    int value;
    Tree left;
    Tree right;

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Tree(int value) {
        this.value = value;
    }

    public static int sumRecursive(Tree tree){
        int sum = tree.value;
        //System.out.println(tree.value);
        if (tree.left != null) {
            sum += sumRecursive(tree.left);
        }
        if (tree.right != null) {
            sum += sumRecursive(tree.right);
        }
        return sum;
    }

    public static int sumDeep(Tree tree){
        int sum = 0;
        Stack<Tree> stack = new Stack<>();
        stack.push(tree);

        while (!stack.empty()) {
            Tree node = stack.pop();
            //System.out.println(node.value);
            sum = sum + node.value;
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return sum;
    }

    public static int sumBreadth(Tree tree){
        int sum = 0;
        Deque<Tree> deque = new ArrayDeque<>();
        deque.addLast(tree);

        while (!deque.isEmpty()) {
            Tree node = deque.removeFirst();
            //System.out.println(node.value);
            sum = sum + node.value;
            if (node.right != null) {
                deque.addLast(node.right);
            }
            if (node.left != null) {
                deque.addLast(node.left);
            }
        }
        return sum;
    }
}
