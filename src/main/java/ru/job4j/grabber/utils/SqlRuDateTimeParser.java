package ru.job4j.grabber.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class SqlRuDateTimeParser implements DateTimeParser {

    private static final Map<String, String> MONTHS = Map.ofEntries(
            Map.entry("янв", "01"),
            Map.entry("фев", "02"),
            Map.entry("мар", "03"),
            Map.entry("апр", "04"),
            Map.entry("май", "05"),
            Map.entry("июн", "06"),
            Map.entry("июл", "07"),
            Map.entry("авг", "08"),
            Map.entry("сен", "09"),
            Map.entry("окт", "10"),
            Map.entry("ноя", "11"),
            Map.entry("дек", "12")

    );

    @Override
    public LocalDate parse(String parse) {
        String[] date = parse.split(" ");
        for (String format : MONTHS.keySet()) {
            if (date[1].equals(format)) {
                date[1] = MONTHS.get(format);
            }
        }
        String[] par = date[2].split(",");
        date[2] = par[0];
        String result = String.format("%s-%s-%s-%s", date[0], date[1], date[2], date[3]);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm");
        return LocalDate.parse(result, dateTimeFormatter);
    }

    public static void main(String[] args) {
        SqlRuDateTimeParser sql = new SqlRuDateTimeParser();

        String date = "10 сен 21, 20:08";
        System.out.println(sql.parse(date));
    }
}