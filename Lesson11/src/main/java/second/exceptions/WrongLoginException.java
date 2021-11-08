package second.exceptions;

public class WrongLoginException extends Exception {
    public WrongLoginException(String login) {
        super(login);
    }
}
