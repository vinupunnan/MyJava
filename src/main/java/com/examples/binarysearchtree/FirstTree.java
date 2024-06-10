package com.examples.binarysearchtree;

public class FirstTree {
    BinaryNode root;
    FirstTree() {
        this.root = null;

    }

    private BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("The value successfully inserted");
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
            System.out.println("The value test1 inserted");
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
            System.out.println("The value test2 inserted");
            return currentNode;
        }
    }

    void insertTEst(int value) {
        root = insert(root, value);
    }

   }





