package ru.job4j.design.srp;

import java.util.List;
import java.util.function.Predicate;

public class ReportHR implements Report {

    private Store store;

    public ReportHR(Store store) {
        this.store = store;
    }

    @Override
    public String generate(Predicate<Employee> filter) {
        StringBuilder text = new StringBuilder();
        List<Employee> list = store.findBy(filter);
        list.sort((t1, t2) -> (int) (t1.getSalary() - t2.getSalary()));
        text.append("Name; Salary;");
        for (Employee employee : list) {
            text.append(employee.getName()).append(";")
                    .append(employee.getSalary()).append(";")
                    .append(System.lineSeparator());
        }
        return text.toString();
    }
}
