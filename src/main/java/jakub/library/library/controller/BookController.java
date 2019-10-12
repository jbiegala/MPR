package jakub.library.library.controller;

import jakub.library.library.service.BookService;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public BookService getBookService() {
        return (BookService) bookService.findAll();
    }
}
