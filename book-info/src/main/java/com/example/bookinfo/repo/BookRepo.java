package com.example.bookinfo.repo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bookinfo.model.Book;

@Qualifier("BookRepo")
public interface BookRepo extends JpaRepository<Book, Integer> {
}

