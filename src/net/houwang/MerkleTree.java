package net.houwang;

import java.util.Map;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import net.houwang.common.TreeNode;
import static net.houwang.MerkleTreeConfigs;

class MerkleTree<Key, Value>{
    private Map<Object, Object> valueMap;
    private TreeNode<Integer> root;

    public MerkleTree(int childrenLimit) {
        this.valueMap = new ConcurrentHashMap<Key, Value>();
        this.root = createNode(-1);
    }

    private TreeNode createNode(int value) {
        return new TreeNode<Integer>(value, MerkleTreeConfigs.MAX_TREE_NODE_CHIDLREN);
    }

    public int size() {
        return this.valueMap.size();
    }

    public boolean isEmpty() {
        return valueMap.isEmpty();
    }

    public Value put(Key key, Value value) {
    }

    public Value remove(Object key) {
        // do not support remove
    }
}