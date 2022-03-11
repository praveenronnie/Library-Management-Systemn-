package com.example.LibraryManagementSystem.Entity;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class BookEntity {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookId;

    @Column
    private String bookName;

    @Column
    private String bookWriter;

    @Column
    private String bookSummary;

    @Column
    private String bookCategory;

    public long getBookId() {
        return bookId;
    }
    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookWriter() {
        return bookWriter;
    }

    public void setBookWriter(String bookWriter) {
        this.bookWriter = bookWriter;
    }

    public String getBookSummary() {
        return bookSummary;
    }

    public void setBookSummary(String bookSummary) {
        this.bookSummary = bookSummary;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public BookEntity(long bookId, String bookName, String bookWriter, String bookSummary, String bookCategory) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookWriter = bookWriter;
        this.bookSummary = bookSummary;
        this.bookCategory = bookCategory;
    }

    public BookEntity() {
    }
}
