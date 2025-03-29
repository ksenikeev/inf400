package ru.itis.inf400.lab2_04;

public interface Map400<K, V> {
    void put(K key, V value);

    V get(K key);

    Set400<K> keySet();

    List400<V> values();

    int size();

    boolean containsKey(K key);

    boolean isEmpty();

    boolean containsValue(V value);

    V remove(K key);

    void clear();

    interface Entry<K, V> {
        void setKey(K key);
        void setValue(V value);
        K getKey();
        V getValue();
    }
}
