package library.service;

import library.model.Book;
import library.model.Reader;

import java.util.List;

public interface ILibraryBookService {
    Book findById(int id);

    List<Book> findAllBooks();

    List<Book> findAllBooksOrderByYear();

    List<Book> findAllBooksByReader(Reader reader);

    void addBookToLibrary(Book book);

    void removeBookFromLibrary(Book book);
}