package ru.job4j.cashe;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractCash<K, V> {

    protected final Map<K, SoftReference<V>> cash = new HashMap<>();

    public void put(K key, V value) {
        cash.put(key, new SoftReference<V>(value));
    }

    public V get (K key) {
        V value = cash.getOrDefault(key, new SoftReference<V>(null)).get();
        value = load(key);
        put(key, value);
        return value;
    }

    protected abstract V load(K key);
}
