package jakub.library.library.service;

import jakub.library.library.model.Book;
import jakub.library.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) { this.bookRepository = bookRepository; };

    public List<Book> getAllBooks() {
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

    public Book getBookById(int id) {
        return bookRepository.findById(id).get();
    }

    public int saveOrUpdate(Book book) {
        bookRepository.save(book);
        return book.getId();
    }

    public void delete(int id) {
        bookRepository.deleteById(id);
    }

}
