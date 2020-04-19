package io.uma.springbootmysql;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.uma.springbootmysql.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}