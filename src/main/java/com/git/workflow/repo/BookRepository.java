package com.git.workflow.repo;

import com.git.workflow.model.Book;
import org.springframework.stereotype.Repository;

import java.util.*;

import static java.util.stream.Collectors.toList;

@Repository
public class BookRepository {

    private Map<Long, Book> books = new HashMap<>();

    public Optional<Book> findById(long id) {
        return Optional.ofNullable(books.get(id));
    }

    public void add(Book book) {
        books.put(book.getId(), book);
    }

    public Collection<Book> getBooks() {
        return books.values();
    }

   /* public Page<Book> getBooks(Pageable pageable) {
        int toSkip = pageable.getPageSize() * pageable.getPageNumber();
        List<Book> result = books.values().stream().skip(toSkip).limit(pageable.getPageSize()).collect(toList());

        return new PageImpl<>(result, pageable, books.size());
    }*/
}
