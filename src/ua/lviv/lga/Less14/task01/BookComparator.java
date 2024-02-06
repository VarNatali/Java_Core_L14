package ua.lviv.lga.Less14.task01;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {


        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        } else {
            if (o1.getPage() > o2.getPage()) {
                return 1;
            } else if (o1.getPage() < o2.getPage()) {
                return -1;
            }
        }


        return 0;
    }
}


