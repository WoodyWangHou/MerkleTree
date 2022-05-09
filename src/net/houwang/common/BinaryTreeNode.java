package net.houwang.common;
/**
* BinaryTreeNode is a simple and generic abstraction for a node in a binary tree
*/
class BinaryTreeNode<ValueType> {
    private ValueType value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(ValueType value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BinaryTreeNode left() {
        return this.left;
    }

    public BinaryTreeNode right() {
        return this.right;
    }

    public ValueType value() {
        return this.value;
    }

    public boolean hasChildren() {
        return left != null || right != null;
    }
};