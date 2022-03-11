package com.example.LibraryManagementSystem.Repository;

import com.example.LibraryManagementSystem.Entity.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Long>{

}
