package com.bridgelabz;

public class Node {
    int value;
    Node left;
    Node right;
    int size;

    public Node(int value) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.size = getSize();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }


}
