package ru.job4j.grabber;

import java.io.InputStream;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PsqlStore implements Store, AutoCloseable {

    private Connection connection;

    public PsqlStore(Properties cfg) {
        ClassLoader loader = PsqlStore.class.getClassLoader();
        try (InputStream in = loader.getResourceAsStream("store.properties")) {
            cfg.load(in);
        Class.forName(cfg.getProperty("driver-class-name"));
        connection = DriverManager.getConnection(
                cfg.getProperty("url"),
                cfg.getProperty("login"),
                cfg.getProperty("password")
        );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
    @Override
    public void save(Post post) {
        try (PreparedStatement pr = connection.prepareStatement(
                "insert into post (name, text, link, created) values (?, ?, ?, ?)"
        )) {
            pr.setString(1, post.getTitle());
            pr.setString(2, post.getDescription());
            pr.setString(3, post.getLink());
            pr.setDate(4, Date.valueOf(post.getCreated()));
            pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Post> getAll() {
        List<Post> list = new ArrayList<>();
        try (PreparedStatement pr = connection.prepareStatement(
                "selsect * from post")) {
            try (ResultSet rs = pr.executeQuery()) {
                while (rs.next()) {
                    Post post = new Post(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("text"),
                    rs.getString("link"),
                            LocalDate.parse(rs.getString("created"))
                    );
                    list.add(post);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Post findById(int id) {
        Post post = new Post();
        try (PreparedStatement pr = connection.prepareStatement(
                "select * from post id = ?")) {
            pr.setInt(1, id);
            try (ResultSet rs = pr.executeQuery()) {
                while (rs.next()) {
                   post.setTitle(rs.getString("name"));
                   post.setDescription(rs.getString("text"));
                   post.setLink(rs.getString("link"));
                   post.setCreated(LocalDate.parse(rs.getString("created")));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return post;
    }

    @Override
    public void close() throws Exception {
        if (connection != null) {
            connection.close();

        }
    }
}
