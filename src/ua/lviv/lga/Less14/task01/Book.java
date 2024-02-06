package ua.lviv.lga.Less14.task01;

public class Book implements Comparable<Book> {
    private String name;
    private int page;
    private int year;

    public Book(String name, int page, int year) {
        this.name = name;
        this.page = page;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getPage() {
        return page;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;

        if (getPage() != book.getPage()) return false;
        if (getYear() != book.getYear()) return false;
        return getName().equals(book.getName());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getPage();
        result = 31 * result + getYear();
        return result;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", page=" + page + ", year=" + year ;
    }

    @Override
    public int compareTo(Book o) {
        return (this.year > o.getYear()) ? 1 : -1;

    }
}
