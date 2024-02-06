package ua.lviv.lga.Less14.task01;

import java.util.*;

public class MainBook {
    public static void main(String[] args) {

        HashSet<Book> hs = new HashSet<>();
        hs.add(new Book(" Open", 125, 2020));
        hs.add(new Book(" This", 520, 2018));
        hs.add(new Book(" Object", 780, 2016));

        hs.add(new Book(" Book", 987, 2018));
        hs.add(new Book(" Director", 485, 2010));
        hs.add(new Book(" Team ", 1050, 2006));

        hs.add(new Book(" Able", 687, 2015));
        hs.add(new Book(" Embeddable ", 784, 2017));
        hs.add(new Book(" Decided ", 1058, 2005));


        System.out.println("HashSet elements  without sorting");
        for (Book b : hs) {
            System.out.println(b);

        }
        System.out.println();

        LinkedHashSet<Book> lhs = new LinkedHashSet<>();
        lhs.add(new Book(" Open", 125, 2020));
        lhs.add(new Book(" This", 520, 2018));
        lhs.add(new Book(" Object", 780, 2016));
        lhs.add(new Book(" Director", 485, 2010));
        lhs.add(new Book(" Team ", 1050, 2006));
        lhs.add(new Book(" Able", 687, 2015));
        lhs.add(new Book(" Embeddable ", 784, 2017));
        lhs.add(new Book(" Decided ", 1058, 2005));


        System.out.println("LinkedHashSet elements without sorting");
        for (Book b : lhs) {
            System.out.println(b);

        }
        System.out.println();

        TreeSet<Book> tr = new TreeSet<>();
        tr.add(new Book(" Open", 125, 2020));
        tr.add(new Book(" This", 520, 2018));
        tr.add(new Book(" Object", 780, 2016));
        tr.add(new Book(" Object", 520, 2016));
        tr.add(new Book(" Director", 485, 2010));
        tr.add(new Book(" Team ", 1050, 2006));
        tr.add(new Book(" Able", 687, 2015));
        tr.add(new Book(" Embeddable ", 784, 2017));
        tr.add(new Book(" Decided ", 1058, 2005));


        System.out.println("TreeSet elements sorting with comparable (Year) ");
        for (Book b : tr) {
            System.out.println(b);

        }
        System.out.println();

        TreeSet<Book> tr2 = new TreeSet<>(new BookComparator());
        tr2.add(new Book(" Open", 125, 2020));
        tr2.add(new Book(" This", 520, 2018));
        tr2.add(new Book(" Object", 780, 2016));
        tr2.add(new Book(" Object", 520, 2016));
        tr2.add(new Book(" Director", 485, 2010));
        tr2.add(new Book(" Team", 1050, 2006));
        tr2.add(new Book(" Able", 687, 2015));
        tr2.add(new Book(" Embeddable ", 784, 2017));
        tr2.add(new Book(" Decided ", 1058, 2005));


        System.out.println("TreeSet elements sorting with Coparator (name and page) ");
        for (Book b : tr2) {
            System.out.println(b);

        }

    }
}
