package pro.sky.java.course1.homework10;

import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int year;

    public Book(String bookName, Author author, int year) {
        this.bookName = bookName;
        this.author = author;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;

    }

    @Override
    public String toString () {
        return bookName + " " + author.toString() + " " + year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName + author+year);
    }


    }







