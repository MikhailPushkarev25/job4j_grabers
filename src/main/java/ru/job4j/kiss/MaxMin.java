package ru.job4j.kiss;

import java.util.Comparator;
import java.util.List;

public class MaxMin {

    public <T> T result(List<T> value, Comparator<T> comparator) {
        T rsl = value.get(0);
        for (int i = 0; i < value.size(); i++) {
            rsl = comparator.compare(rsl, value.get(i)) > 0 ? rsl : value.get(i);
        }
        return rsl;
    }

    public <T> T max(List<T> value, Comparator<T> comparator) {
        return result(value, comparator);
    }

    public <T> T min(List<T> value, Comparator<T> comparator) {
        return result(value, comparator.reversed());
    }
}
