package library.service;

import library.model.EmailAddress;
import library.model.Reader;

import java.util.List;
import java.util.stream.Collectors;

public class MessagingServiceImpl implements IMessagingService {
    @Override
    public List<EmailAddress> createMailingList(String message, List<Reader> readers) {
        return readers.stream()
                .map(r -> new EmailAddress(r.getEmail(), message))
                .collect(Collectors.toList());
    }
}
