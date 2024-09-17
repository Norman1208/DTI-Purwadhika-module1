package org.example;

public class BinarySearchTree {

    //inner class to represent a node in the binary search tree
    private class TreeNode {
        int value;
        TreeNode left, right;

        // constructor to initialize a node with a value
        public TreeNode(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }

    private TreeNode root;

    // constructor to initialize an empty BST
    public BinarySearchTree() {
        this.root = null;
    }

    // method to insert new value into the BST
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    //recursive method to insert new value in the correct position
    private TreeNode insertRecursive(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        // recur down the tree
        if (value < root.value) {
            root.left = insertRecursive(root.left, value);
        } else if (value > root.value){
            root.right = insertRecursive(root.right, value);
        } else {
            System.out.println("Duplicate value "+ value + " ignored.");
        }

        return root;
    }

    // methodto search for a value in the BST
    public boolean search(int value) {
        return searchRecursive(root, value);
    }

    // recursive method to search for a value
    private boolean searchRecursive(TreeNode root, int value) {
        if (root == null){
            return false;
        }

        if (value == root.value) {
            return true;
        }

        // search left or right subtree based on the value
        if (value < root.value){
            return searchRecursive(root.left, value);
        } else {
            return searchRecursive(root.right, value);
        }
    }

    // method to perform an in-order traversal (for debugging)
    public void inorderTraversal() {
        inorderRecursive(root);
        System.out.println();
    }

    // recursive method for in-order traversal
    private void inorderRecursive(TreeNode root) {
        if (root != null) {
            inorderRecursive(root.left);
            System.out.println(root.value+ " ");
            inorderRecursive(root.right);
        }
    }
}
