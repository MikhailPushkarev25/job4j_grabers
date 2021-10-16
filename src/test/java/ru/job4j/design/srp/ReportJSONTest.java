package ru.job4j.design.srp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;

import java.util.Calendar;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ReportJSONTest {

    @Test
    public void whenGenerateJSON() {
        MemStore store = new MemStore();
        Gson gson = new GsonBuilder().create();
        Calendar now1 = Calendar.getInstance();
        Calendar now2 = Calendar.getInstance();
        now1.set(2021, 10, 16);
        now2.set(2021, 10, 10);
        Employee worker = new Employee("Ivan", now1, now2, 100);
        store.add(worker);
        Report engine = new ReportJSON(store);
        StringBuilder expect = new StringBuilder()
                .append("{\"name\":\"Ivan\",\"hired\":")
                .append(gson.toJson(worker.getFired()))
                .append(",\"fired\":")
                .append(gson.toJson(worker.getHired()))
                .append(",\"salary\":100.0};")
                .append(System.lineSeparator());
        assertThat(engine.generate(em -> true), is(expect.toString()));
    }
}