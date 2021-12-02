package com.example.bookinfo.repo;

import com.example.bookinfo.model.BookInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<BookInfo, Integer> {
}
