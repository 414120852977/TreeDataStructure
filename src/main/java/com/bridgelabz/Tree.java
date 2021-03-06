package com.bridgelabz;

public class Tree {

    public void insert(Node node,int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left,value);
            }
            System.out.println("insert"+value+"to left"+node.value);
            node.left = new Node(value);
        }
        else if (value > node.value) {
            if (node.right != null) {
                insert(node.right,value);
            }
            else {
                System.out.println("insert"+value+"to right"+node.value);
                node.right = new Node(value);
            }
        }
    }

    public boolean iterativeSearch(Node root, int value)
    {
        while (root != null) {

            if (value > root.value) {
                root = root.right;
                System.out.println("root at right");
            }
            else if (value<root.value) {
                        root = root.left;
                System.out.println("root at left");
            }
            else
                return true;
        }
        return false;
    }
}
