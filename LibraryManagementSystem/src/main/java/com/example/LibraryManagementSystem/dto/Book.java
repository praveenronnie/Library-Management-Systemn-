package com.example.LibraryManagementSystem.dto;

import lombok.*;
import org.springframework.cglib.beans.BeanCopier;

import java.io.Serializable;


//@Data
//@NoArgsConstructor
//@Getter
//@Setter
//@ToString
public class Book implements Serializable {


    private long bookId;
    private String bookName;
    private String bookWriter;
    private String bookSummary;
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

    public Book(long bookId, String bookName, String bookWriter, String bookSummary, String bookCategory) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookWriter = bookWriter;
        this.bookSummary = bookSummary;
        this.bookCategory = bookCategory;
    }

    public Book() {
    }
}
