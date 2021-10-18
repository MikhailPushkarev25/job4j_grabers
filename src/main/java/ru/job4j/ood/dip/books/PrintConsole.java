package ru.job4j.ood.dip.books;

public class PrintConsole {
    /**
     * Пример нарушения принципа DIP - класс Book жестко связан с классом принтер
     * для использования принципа, нужно задать зависимость от обстракции
     *
     * @param book
     */
    public void print(Book book) {
        System.out.println("Название книги: " + book.getName() + " количество страниц " + book.getSize());
    }

    public static void main(String[] args) {
        PrintConsole print = new PrintConsole();
        Book book = new Book("Mikle Hors", 356);
        print.print(book);
    }
}
