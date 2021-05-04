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
        Assert.assertEquals(56,node.value);
    }
}
