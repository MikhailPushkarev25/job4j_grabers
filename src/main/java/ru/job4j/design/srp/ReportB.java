package ru.job4j.design.srp;

import java.util.function.Predicate;

public class ReportB implements Report {

    private Store store;

    public ReportB(Store store) {
        this.store = store;
    }

    @Override
    public String generate(Predicate<Employee> filter) {
        StringBuilder text = new StringBuilder();
        text.append("Name; Hired; Fired; Salary;");
        for (Employee employee : store.findBy(filter)) {
            text.append(employee.getName()).append(";")
                    .append(employee.getHired()).append(";")
                    .append(employee.getFired()).append(";")
                    .append(employee.getSalary() / 74).append(";")
                    .append(System.lineSeparator());
        }
        return text.toString();
    }
}
