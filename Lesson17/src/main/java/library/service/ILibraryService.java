package library.service;

public interface ILibraryService {
    void getBookToReader(int bookId, int readerId);

    void receiveBookToLibrary(int readerId, int bookId);
}

