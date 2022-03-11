package com.example.LibraryManagementSystem.Controller;

import com.example.LibraryManagementSystem.Service.Services;
import com.example.LibraryManagementSystem.dto.Book;
import com.example.LibraryManagementSystem.dto.User;
import com.example.LibraryManagementSystem.dto.UserBookHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.OneToOne;

@RestController
public class controller {

    @Autowired
    private Services services;

    @PostMapping(value = "/adduser")
    public User addUser(@RequestBody User user)
    {
        System.out.println("==============ADD USER===========");
        services.addUser(user);
        return user;
    }

    @PostMapping("/addbook")
    public void addBook(@RequestBody Book book)
    {
        System.out.println("==============addbookpostmap===========");
        services.addBook(book);

    }

//    @GetMapping(value = "/Users")
//    public List<User> getUsers(){
//        return services.getAllUsers();
//    }

//    @PostMapping(value = "/issuebook")
//    public void issueBook(@RequestBody UserBookHistory userBookHistory)
//    {
//        System.out.println("=============issue_book==========");
//        services.issueBook(userBookHistory);
//    }

//    @PostMapping(value = "/returnbook")
//    public void returnBook(@RequestBody UserBookHistory userBookHistory)
//    {
//        services.returnBook(userBookHistory);
//    }



}
