package second;

import second.exceptions.WrongLoginException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongLoginException {
        Authorization authorization = new AuthorizationImpl();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Логин:");
        String login = scanner.next();

        System.out.println("Пароль:");
        String password = scanner.next();

        System.out.println("Повторите пароль:");
        String confirmPassword = scanner.next();

        System.out.println(authorization.checkAuthorization(login, password, confirmPassword));
    }
}
