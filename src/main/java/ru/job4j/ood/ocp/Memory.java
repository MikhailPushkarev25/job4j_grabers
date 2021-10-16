package ru.job4j.ood.ocp;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Memory {

    /**
     * В классе так же показал пример того как происходит нарушение принципа ОСР
     * я указал некую память и вывожу ее на консоль при этом ее можно изменить
     * @param num
     * @return
     */
    public List<Integer> size(int num) {
        Random random = new Random();
        return IntStream.range(0, num)
                .map(i -> random.nextInt()).boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<List<Integer>> memories = Arrays.asList(
                new Memory().size(100),
                new Memory().size(1000),
                new Memory().size(10000)
        );
        System.out.println(memories.get(1));

    }
}
