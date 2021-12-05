package second;

import second.exceptions.WrongLoginException;

public interface Authorization {
    boolean checkAuthorization(String login, String password, String confirmPassword) throws WrongLoginException;
}
