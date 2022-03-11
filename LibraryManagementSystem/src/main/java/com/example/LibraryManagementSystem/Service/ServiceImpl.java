package com.example.LibraryManagementSystem.Service;

import com.example.LibraryManagementSystem.Entity.BookEntity;
import com.example.LibraryManagementSystem.Entity.UserBookHistoryEntity;
import com.example.LibraryManagementSystem.Entity.UserEntity;
import com.example.LibraryManagementSystem.Repository.BookRepository;
import com.example.LibraryManagementSystem.Repository.UserBookHistoryRepository;
import com.example.LibraryManagementSystem.Repository.UserRepository;
import com.example.LibraryManagementSystem.dto.Book;
import com.example.LibraryManagementSystem.dto.User;
import com.example.LibraryManagementSystem.dto.UserBookHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements Services {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserBookHistoryRepository userBookHistoryRepository;

    @Override
//    public List<User> getAllUsers()
//    {
//        List<User> list = new ArrayList<>();
//        for(UserEntity userEntity : userRepository.findAll())
//        {
//            User user = new User();
//            user.setUserId(userEntity.getUserId());
//            user.setName(userEntity.getUserName());
//            user.setAddress(userEntity.getAddress());
//            user.setPhoneNumber(userEntity.getPhoneNumber());
//            list.add(user);
//        }
//        return list;
//    }

    @Override
    public User addUser(User user)
    {
        UserEntity userEntity = new UserEntity(user.getUserId(), user.getUserName(), user.getAddress(), user.getPhoneNumber());
        userRepository.save(userEntity);
        return user;
    }

    @Override
    public void addBook(Book book)
    {

        bookRepository.save(new BookEntity(book.getBookId(),book.getBookName(),book.getBookWriter(),book.getBookSummary(),book.getBookCategory()));
    }

    @Override
    public void issueBook(UserBookHistory userBookHistory){
        UserBookHistoryEntity userBookHistoryEntity = new UserBookHistoryEntity();

        Optional<UserEntity> byId = userRepository.findById(userBookHistory.getUserId());
        Optional<BookEntity> byId1 = bookRepository.findById(userBookHistory.getBookId());
        if(byId.isPresent() && byId1.isPresent()){

            BookEntity bookEntity = byId1.get();
            userBookHistoryEntity.setBook(bookEntity);

            userBookHistoryEntity.setStartDate(userBookHistory.getStartDate());
            userBookHistoryEntity.setEndDate(userBookHistory.getEndDate());

            UserEntity userEntity = byId.get();
            userBookHistoryEntity.setUser(userEntity);

            userBookHistoryRepository.save(userBookHistoryEntity);

        }
    }


    @Override
    public void returnBook(UserBookHistory userBook)
    {
        for(UserBookHistoryEntity userBookHistory:userBookHistoryRepository.findAll()) {
            if (userBookHistory.getUserId() == userBook.getBookId() && StringUtils.isEmpty(userBookHistory.getEndDate())) {
                userBookHistory.setEndDate(userBook.getEndDate());
                userBookHistoryRepository.save(userBookHistory);
            }
        }

    }

    @Override
    public Book getPopularBook() {
    }
}
