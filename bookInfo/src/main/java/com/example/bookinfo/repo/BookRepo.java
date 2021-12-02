package com.example.bookinfo.repo;

import com.example.bookinfo.model.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
@Qualifier("BookRepo")
public interface BookRepo extends JpaRepository<Book, Integer> {
}
