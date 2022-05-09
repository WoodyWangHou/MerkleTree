package net.houwang;

import java.util.Map;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import net.houwang.common.BinaryTreeNode;

class MerkleTree<Key, Value> extends Dictionary<Key, Value> {
    private Map<Object, Object> valueMap;
    private BinaryTreeNode<Integer> root;

    public MerkleTree() {
        this.valueMap = new ConcurrentHashMap<Key, Value>();
        this.root = new BinaryTreeNode<Integer>(-1);
    }

    @Override
    public int size() {
    }

    @Override
    public boolean isEmpty() {
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
    }
}