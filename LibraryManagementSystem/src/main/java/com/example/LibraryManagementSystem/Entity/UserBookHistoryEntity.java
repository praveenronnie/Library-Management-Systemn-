package com.example.LibraryManagementSystem.Entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_book_history")
public class UserBookHistoryEntity {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private long userId;

    @Column
    private long bookId;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    UserEntity user;

    @ManyToOne
    @JoinColumn(name = "bookId", referencedColumnName = "id")
    BookEntity book;

    public long getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
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

    public UserBookHistoryEntity(long userId, long bookId, Date startDate) {
        this.userId = userId;
        this.bookId = bookId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }


//    public UserBookHistoryEntity(long userId, long bookId, Date startDate) {
//
//    }
}
