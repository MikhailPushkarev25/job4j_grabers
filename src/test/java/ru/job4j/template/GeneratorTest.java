package ru.job4j.template;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GeneratorTest {

    @Test
    public void whenGeneratorTest() {
        Gen gen = new Gen();
        Map<String, String> map = new HashMap<>();
        map.put("name", "Mikhail");
        map.put("subject", "you");
        String value = "I am a ${name}, Who are ${subject}? ";
        String result = "I am a Mikhail, Who are you? ";
        String sum = gen.produce(value, map);
        assertThat(sum, is(result));
    }

    @Test (expected = NoSuchElementException.class)
    public void whenExpectedElement() {
        Gen gen = new Gen();
        Map<String, String> map = new HashMap<>();
        String value = "I am a ${name}, Who are ${subject}? ";
        String result = "I am a Mikhail, Who are you? ";
        String sum = gen.produce(value, map);
    }

    @Test (expected = IllegalArgumentException.class)
    public void whenArgumentException() {
        Gen gen = new Gen();
        Map<String, String> map = new HashMap<>();
        map.put("names", "Mikhail");
        map.put("subjects", "you");
        String value = "I am a ${name}, Who are ${subject}? ";
        String result = "I am a Mikhail, Who are you? ";
        String sum = gen.produce(value, map);
    }
}