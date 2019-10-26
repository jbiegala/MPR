package jakub.library.library.controller;

import jakub.library.library.model.Book;
import jakub.library.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) { this.bookService = bookService; };

    @GetMapping("/book")
    private List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/book/{id}")
    private Book getBook(@PathVariable("id") int id) {
        return bookService.getBookById(id);
    }

    @DeleteMapping("/book/{id}")
    private void deleteBook(@PathVariable("id") int id) {
        bookService.delete(id);
    }

    @PostMapping("/book")
    private int saveBook(@RequestBody Book book) {
        return bookService.saveOrUpdate(book);
    }
}
