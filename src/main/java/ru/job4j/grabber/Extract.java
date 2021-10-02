package ru.job4j.grabber;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import ru.job4j.grabber.utils.SqlRuDateTimeParser;

import java.io.IOException;

public class Extract {

    public static Post detail(String url) throws IOException {
        Post post = new Post();
        Document doc = Jsoup.connect(url).get();
        Elements row = doc.select(".msgBody");
        post.setDescription(row.get(0).parent().child(1).text());
        Elements el = doc.select(".msgFooter");
        String[] date = el.get(0).parent().child(1).text().split("\\[");
        SqlRuDateTimeParser sql = new SqlRuDateTimeParser();
        post.setCreated(sql.parse(date[0]));
        return post;
    }
}
