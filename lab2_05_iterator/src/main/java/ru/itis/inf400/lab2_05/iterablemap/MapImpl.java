package ru.itis.inf400.lab2_05.iterablemap;

import java.util.Iterator;

public class MapImpl<K, V> implements Map400<K, V> {
    private Node<K, V>[] hashArray = new Node[16];
    private int size;

    class MyIterator implements Iterator<Entry<K, V>> {
        Node<K,V> currentElemet;
        int currentCell;
        int currentNum;

        MyIterator() {
            currentNum = 0;
            currentCell = 0;
            while ( currentCell < hashArray.length) {
                if ((currentElemet = hashArray[currentCell]) != null) { break; }
                currentCell++;
            }

        }

        @Override
        public boolean hasNext() {
            return currentNum < size;
        }

        @Override
        public Entry<K, V> next() {
            Node<K,V> tmp  = currentElemet;
            if (currentElemet.next != null) {
                currentElemet = currentElemet.next;
            } else {
                for(++currentCell; currentCell < hashArray.length; ++currentCell) {
                    if ((currentElemet = hashArray[currentCell]) != null) break;
                }
            }
            currentNum++;
            return tmp.value;
        }
    }

    @Override
    public Iterator<Entry<K, V>> iterator() {
        return new MyIterator();
    }

    @Override
    public void put(K key, V value) {
        int index = Math.abs(key.hashCode() % 16);
        Node<K, V> node = new Node<>(new EntryImpl<>(key, value));
        if (hashArray[index] == null) {
            hashArray[index] = node;
        } else {
            Node<K, V> currentNode = hashArray[index];

            while (true) {
                if (currentNode.value.getKey().equals(key)) {
                    currentNode.value.setValue(value);
                    return;
                }
                if (currentNode.next == null) {
                    currentNode.next = node;
                } else {
                    currentNode = currentNode.next;
                }
            }
        }
        size++;
    }

    @Override
    public V get(K key) {
        // По хешу ключа находим индекс (index) в массиве, где начинается связный список
        int index = Math.abs(key.hashCode() % 16);
        Node<K, V> current = hashArray[index];
        // Идем по связному списку, начиная с головы, которая хранится в ячейке
        // hashArray[index]
        // ищем пару в которой ключ равен аргументу метода
        while (current != null) {
            EntryImpl<K,V> currentValue = current.value;
            if (currentValue.key.equals(key)) {

                return currentValue.value;
            }
            current = current.next;
        }

        return null;
    }

    @Override
    public Set400<K> keySet() {

        return null;
    }

    @Override
    public V remove(K key) {
        int index = Math.abs(key.hashCode() % 16);
        Node<K, V> current = hashArray[index];

        if (current == null) {return null;}
        if (current.value.key.equals(key)) {
            hashArray[index] = current.next;
            size--;
            return current.value.value;
        }

        // Идем по связному списку, начиная с головы, которая хранится в ячейке
        // hashArray[index]
        // ищем пару в которой ключ равен аргументу метода
        while (current.next != null) {
            EntryImpl<K,V> currentValue = current.next.value;
            if (currentValue.key.equals(key)) {
                V res = currentValue.value;
                current.next = current.next.next;
                size--;
                return res;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public List400<V> values() {
        List400<V> result = new ArrayListImpl<>();
        for(int i = 0; i < hashArray.length; ++i) {
            Node<K, V> current = hashArray[i];
            while (current != null) {
                result.add(current.value.getValue());
                current = current.next;
            }
        }
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public void clear() {

    }

    class EntryImpl<K, V> implements Entry<K, V> {
        private K key;
        private V value;

        public EntryImpl(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public void setKey(K key) {
            this.key = key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry(" + key + ", " + value + ")";
        }
    }

    class Node<K, V> {
        private Node next;
        private EntryImpl<K, V> value;

        public Node(EntryImpl<K, V> value) {
            this.value = value;
        }
    }
}

