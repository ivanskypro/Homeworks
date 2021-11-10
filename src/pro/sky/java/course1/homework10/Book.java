package pro.sky.java.course1.homework10;

import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int releaseYear;

    public Book(String bookName, Author author, int releaseYear) {
        this.bookName = bookName;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYear() {
        return releaseYear;
    }

    public void setYear(int releaseYear) {
        this.releaseYear = releaseYear;

    }

    @Override
    public String toString () {
        return bookName + " " + author.toString() + " " + releaseYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName + author+releaseYear);
    }
    }







