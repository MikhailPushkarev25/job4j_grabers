package ru.job4j.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class SqlRuParse {
    public static void main(String[] args) throws Exception {
        Document doc = Jsoup.connect("https://www.reg.ru/support/ssl-sertifikaty/otmena-pereizdanie-ssl-sertifikata/kak-prodlit-platnyy-ssl-sertifikat").get();
        Elements row = doc.select(".b-footer-new");
        for (Element td : row) {
            Element parent = td.parent();
            Element href = td.child(0);
            System.out.println(href.attr("href"));
            System.out.println(href.text());
            System.out.println(parent.tag());
            System.out.println(parent.children().size());
            System.out.println(parent.child(5).text());
            System.out.println();
        }
    }
}
