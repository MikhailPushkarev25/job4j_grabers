package ru.job4j.design.srp;

import java.util.function.Predicate;

public class ReportProg implements Report {

    private Store store;

    public ReportProg(Store store) {
        this.store = store;
    }

    @Override
    public String generate(Predicate<Employee> filter) {
        StringBuilder text = new StringBuilder();
        text.append("<!DOCTYPE html>");
        text.append("<html lang='en>");
        text.append("<head><meta charset='utf-8'><title>Report of Reports</title></head>");
        text.append("<tr>Name</tr>");
        text.append("<tr>Hired</tr>");
        text.append("<tr>Fired</tr>");
        text.append("<tr>Salary</tr>");
        for (Employee employee : store.findBy(filter)) {
            text.append("<li>").append(employee.getName()).append("</li>")
                    .append("<li>").append(employee.getHired()).append("</li>")
                    .append("<li>").append(employee.getFired()).append("</li>")
                    .append("<li>").append(employee.getSalary()).append("/li")
                    .append(System.lineSeparator());
        }
        return text.toString();
    }
}
