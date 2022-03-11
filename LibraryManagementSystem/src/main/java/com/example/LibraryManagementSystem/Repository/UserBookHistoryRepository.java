package com.example.LibraryManagementSystem.Repository;

import com.example.LibraryManagementSystem.Entity.UserBookHistoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBookHistoryRepository extends CrudRepository<UserBookHistoryEntity,Long > {

}
