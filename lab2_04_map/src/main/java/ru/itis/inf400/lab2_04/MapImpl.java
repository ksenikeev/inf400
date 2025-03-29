package ru.itis.inf400.lab2_04;

public class MapImpl<K, V> implements Map400<K, V> {
    private Node<K, V>[] hashArray = new Node[16];
    private int size;

    @Override
    public void put(K key, V value) {
        // ищем индекс массива по которому формируем связанный список
        int index = key.hashCode() % 16;
        if (hashArray[index] == null) {
            hashArray[index] = new Node<>(new EntryImpl<K, V>(key, value));
        } else {
            Node node = new Node(new EntryImpl<K, V>(key, value));

            node.next = hashArray[index];
            hashArray[index] = node;
        }
    }

    @Override
    public V get(K key) {
        // По хешу ключа находим индекс (index) в массиве, где начинается связный список
        int index = key.hashCode() % 16;
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
    public List400<V> values() {
        return null;
    }

    @Override
    public int size() {
        return 0;
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
    public V remove(K key) {
        return null;
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
    }

    class Node<K, V> {
        private Node next;
        private EntryImpl<K, V> value;

        public Node(EntryImpl<K, V> value) {
            this.value = value;
        }
    }
}

