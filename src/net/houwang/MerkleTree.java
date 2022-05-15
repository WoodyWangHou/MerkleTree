package net.houwang;

import java.util.Map;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import net.houwang.common.TreeNode;
import static net.houwang.MerkleTreeConfigs;

class MerkleTree<Key, Value> extends Dictionary<Key, Value> {
    private Map<Object, Object> valueMap;
    private TreeNode<Integer> root;

    public MerkleTree(int childrenLimit) {
        this.valueMap = new ConcurrentHashMap<Key, Value>();
        this.root = createNode(-1);
    }

    private TreeNode createNode(int value) {
        return new TreeNode<Integer>(value, MerkleTreeConfigs.MAX_TREE_NODE_CHIDLREN);
    }

    @Override
    public int size() {
        return this.valueMap.size();
    }

    @Override
    public boolean isEmpty() {
        return valueMap.isEmpty();
    }

    private class IterableEnumeration<T> implements Enumeration<T> {
        private Iterator<T> iter;

        public IterableEnumeration(Iterator<T> iter) {
            this.iter = iter;
        }

        @Override
        public boolean hasMoreElements() {
            return iter.hasNext();
        }

        @Override
        public T nextElement() {
            return iter.next();
        }

        @Override
        public Iterator<T> asIterator() {
            return iter;
        }
    }

    @Override
    public Enumeration<Key> keys() {
        return new IterableEnumeration(this.valueMap.keySet().iterator());
    }

    @Override
    public Enumeration<Value> elements() {
        return new IterableEnumeration(this.valueMap.values().iterator());
    }

    @Override
    public Value get(Object key) {
        
    }

    @Override
    public Value put(Key key, Value value) {
    }

    @Override
    public Value remove(Object key) {
        // do not support remove
    }
}