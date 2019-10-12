package jakub.library.library.service;

import jakub.library.library.model.Book;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();

        books.add(
                new Book(
                        1,
                        "Ogniem i Mieczem",
                        "Henryk Sienkiewicz"
                )
        );
        books.add(
                new Book(
                        2,
                        "Potop",
                        "Henryk Sienkiewicz"
                )
        );

        return books;
    }
}
