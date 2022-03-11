package com.example.LibraryManagementSystem.Service;

import com.example.LibraryManagementSystem.dto.Book;
import com.example.LibraryManagementSystem.dto.User;
import com.example.LibraryManagementSystem.dto.UserBookHistory;

import java.util.List;

public interface Services {
    //List<User> getAllUsers();
    void addUser(User user);
    void addBook(Book book);
    void issueBook(UserBookHistory userBookHistory);
    void returnBook(UserBookHistory userBookHistory);
    Book getPopularBook();
}
