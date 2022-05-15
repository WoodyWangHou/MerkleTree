package net.houwang.common;

import java.util.List;
import java.util.ArrayList;
/**
* BinaryTreeNode is a simple and generic abstraction for a node in a binary tree
*/
class TreeNode<ValueType> {
    private ValueType value;
    private List<TreeNode> children;
    private Integer childrenLimit;

    public TreeNode(final ValueType value, final int limit) {
        this.value = value;
        this.children = new ArrayList();
        this.childrenLimit = limit;
    }

    public void add(TreeNode node) {
        if (children.size() < childrenLimit) {
            children.add(node);
        }
    }

    public final List<TreeNode> children() {
        return children;
    }

    public ValueType value() {
        return this.value;
    }

    public boolean hasChildren() {
        return children.isEmpty();
    }
};