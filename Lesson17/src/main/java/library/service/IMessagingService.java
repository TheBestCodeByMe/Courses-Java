package library.service;

import library.model.EmailAddress;
import library.model.Reader;

import java.util.List;

public interface IMessagingService {
    List<EmailAddress> createMailingList(String message, List<Reader> readers);
}
