package ru.job4j.ood.isp;

import java.util.Iterator;

public interface TreeTraversable<T> {

    Iterator<T> preOrder();
    Iterator<T> InOrder();
    Iterator<T> postOrder();
}
  interface GraphTraversable<T> {

      Iterator<T> bfs();
      Iterator<T> dfs();
  }
