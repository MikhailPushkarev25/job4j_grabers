package ru.job4j.kiss;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxMinTest {

    @Test
    public void whenExpectedMaxNumber() {
        MaxMin result = new MaxMin();
        List<Integer> num = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9
        );
        assertThat(result.max(num, Comparator.naturalOrder()), is(9));

    }

    @Test
    public void whenExpectedMinNumbers() {
        MaxMin result = new MaxMin();
        List<Integer> num = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9
        );
        assertThat(result.min(num, Comparator.naturalOrder()), is(1));
    }
}