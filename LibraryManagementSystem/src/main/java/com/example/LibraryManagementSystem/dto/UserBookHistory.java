package com.example.LibraryManagementSystem.dto;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class UserBookHistory implements Serializable {

    private long userId;
    private long bookId;
    private Date startDate;
    private Date endDate;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public UserBookHistory(long userId, long bookId, Date startDate, Date endDate) {
        this.userId = userId;
        this.bookId = bookId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public UserBookHistory() {

    }
}
