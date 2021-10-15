package ru.job4j.design.srp;

import org.junit.Test;

import java.util.Calendar;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ReportProgTest {

    @Test
    public void whenGenerateReportsHtml() {
        MemStore store = new MemStore();
        Calendar now = Calendar.getInstance();
        Employee prog = new Employee("Junior", now, now, 200);
        store.add(prog);
        Report programing = new ReportProg(store);
        StringBuilder expect = new StringBuilder();
        expect.append("<!DOCTYPE html>");
        expect.append("<html lang='en>");
        expect.append("<head><meta charset='utf-8'><title>Report of Reports</title></head>");
        expect.append("<tr>Name</tr>");
        expect.append("<tr>Hired</tr>");
        expect.append("<tr>Fired</tr>");
        expect.append("<tr>Salary</tr>");
        expect.append("<li>").append(prog.getName()).append("</li>")
                .append("<li>").append(prog.getHired()).append("</li>")
                .append("<li>").append(prog.getFired()).append("</li>")
                .append("<li>").append(prog.getSalary()).append("/li")
                .append(System.lineSeparator());
        assertThat(programing.generate(em -> true), is(expect.toString()));
    }
}