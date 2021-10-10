package ru.job4j.cashe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringJoiner;

public class DirFile extends AbstractCash<String, String> {

    private final String cashingDir;

    public DirFile(String cashingDir) {
        this.cashingDir = cashingDir;
    }

    @Override
    protected String load(String key) {
        StringJoiner joiner = new StringJoiner(System.lineSeparator());
        try (BufferedReader reader = new BufferedReader(new FileReader(key + cashingDir))) {
            reader.lines().forEach(joiner::add);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return joiner.toString();
    }
}
