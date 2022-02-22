import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Connection connection = getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getString(2));
            }
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        Properties properties = new Properties();
        Connection connection = null;
        String urlOb;
        String username;
        String password;

        try {
            InputStream in = Files.newInputStream(Path.of("D:\\Универ\\5 семестр\\СиТАиРИС\\Courses-Java-Kolosovich-Uliana\\Lesson21\\src\\main\\resources\\connection.properties"));
            properties.load(in);
            urlOb = properties.getProperty("urlOb");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            connection = DriverManager.getConnection(urlOb, username, password);
        } catch (IOException | SQLException e) {
            System.out.println("Error " + e.getMessage());
        }

        return connection;
    }
}
