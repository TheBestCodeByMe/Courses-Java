package second;

import second.exceptions.WrongLoginException;
import second.exceptions.WrongPasswordException;

public class AuthorizationImpl implements Authorization {
    public boolean checkAuthorization(String login, String password, String confirmPassword) {
        boolean check = true;
        try {
            // но он ещё допускает -, не знаю, как убрать и оставить только _
            // очень не уверена в этой проверке на символы, но я пыталась
            if (!login.matches("^[a-zA-Z-а-яёА-ЯЁ0-9_]+$") || login.length() >= 20) {
                throw new WrongLoginException("Введены неверные символы в логине " + login);
            }

            if (!password.matches("^[a-zA-Z-а-яёА-ЯЁ0-9_]+$") || !password.equals(confirmPassword) || password.length() >= 20) {
                throw new WrongPasswordException("Введены неверные символы в пароле " + password + ". Или пароли не совпадают, повторный пароль " + confirmPassword);
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }
}
