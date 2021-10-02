package ru.job4j.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class SqlRuParse {


    public static void parseSql(String get) throws IOException {
        Document doc = Jsoup.connect(get).get();
        Elements row = doc.select(".b-footer-new");
        Elements size = doc.select(".b-page b-live-tooltip__wrapper notlogged");
        int index = 1;
        for (Element el : row) {
            Element href = el.child(0);
            Element date = size.get(index);
            System.out.println(href.text());
            System.out.println(date.text());
            index += 2;
        }
    }
    public static void main(String[] args) throws Exception {
        String url = "https://www.reg.ru/support/ssl-sertifikaty/otmena-pereizdanie-ssl-sertifikata/kak-prodlit-platnyy-ssl-sertifikat";

        for (int i = 0; i <= 5; i++) {
            parseSql(url + "//" + i);
        }
    }
}
