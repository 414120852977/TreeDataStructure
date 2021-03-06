package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TreeTest {
    /**
     * creating a binary tree 56 is a root node and 30 to the left and 70 to the right.
     */
    @Test
    public void creatingTreeWthTwoNodeLeftAndRight() {
       Node node = new Node(56);
       Tree tree = new Tree();
       tree.insert(node,30);
       tree.insert(node,70);
        Assert.assertEquals(2, node.size);
    }

    @Test
    public void creatingWholeBinaryTree() {
        Node node = new Node(56);
        Tree tree = new Tree();
        tree.insert(node,30);
        tree.insert(node,70);
        tree.insert(node,22);
        tree.insert(node,40);
        tree.insert(node,11);
        tree.insert(node,3);
        tree.insert(node,16);
        tree.insert(node,60);
        tree.insert(node,95);
        tree.insert(node,65);
        tree.insert(node,63);
        tree.insert(node,67);
        Assert.assertEquals(12,node.getSize());
    }

    /**
     * search node 63 in binary tree
     */
    @Test
    public void searchSpecificNode() {
        Node node = new Node(56);
        Tree tree = new Tree();
        tree.insert(node,30);
        tree.insert(node,70);
        tree.insert(node,22);
        tree.insert(node,40);
        tree.insert(node,11);
        tree.insert(node,3);
        tree.insert(node,16);
        tree.insert(node,60);
        tree.insert(node,95);
        tree.insert(node,65);
        tree.insert(node,63);
        tree.insert(node,67);
        tree.iterativeSearch(node,63);
        Assert.assertEquals(13,node.getSize());
    }
}
