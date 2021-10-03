package ru.job4j.grabber;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import ru.job4j.grabber.utils.DateTimeParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SqlRuParse implements Parse {

    private final DateTimeParser dateTimeParser;

    public SqlRuParse(DateTimeParser dateTimeParser) {
        this.dateTimeParser = dateTimeParser;
    }

    @Override
    public List<Post> list(String link) throws IOException {
        List<Post> list = new ArrayList<>();
        int size = 1;
        while (size < 6) {
            Document doc = Jsoup.connect(link).get();
            Elements el = doc.select(".postslisttopic");
            for (Element element : el) {
                Post post = new Post();
                Element href = element.child(0);
                post.setLink(href.attr("href"));
                post.setTitle(href.text());
                Post temp = detail(href.attr("href"));
                post.setCreated(temp.getCreated());
                post.setDescription(temp.getDescription());
                list.add(post);
            }
            size++;
        }
        return list;
    }

    @Override
    public Post detail(String link) throws IOException {
        Post post = new Post();
        Document doc = Jsoup.connect(link).get();
        Elements el = doc.select(".msgBody");
        post.setDescription(el.get(0).parent().child(1).text());
        Elements date = doc.select(".msgFooter");
        String[] str = date.get(0).parent().child(0).text().split("\\[");
        post.setCreated(dateTimeParser.parse(str[0]));
        return post;
    }
}
