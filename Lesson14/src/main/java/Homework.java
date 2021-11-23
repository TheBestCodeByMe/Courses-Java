import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Homework {

    public static void fileReaderWriter(String input, String output, int task) {
        File file = new File("D:\\Универ\\5 семестр\\СиТАиРИС\\Courses-Java-Kolosovich-Uliana\\Lesson14\\src\\main\\resources\\" + output);
        try (FileReader fr = new FileReader("D:\\Универ\\5 семестр\\СиТАиРИС\\Courses-Java-Kolosovich-Uliana\\Lesson14\\src\\main\\resources\\" + input);
             BufferedReader reader = new BufferedReader(fr);
             FileWriter writer = new FileWriter(file, true)) {
            String line = reader.readLine();
            String rez = "";
            while (line != null) {
                if (task == 1) {
                    firstTask(line, writer);
                    line = reader.readLine();
                } else if (task == 2) {
                    if (!line.matches("\s{2,}")) {
                        rez += line;
                    }
                    line = reader.readLine();
                    if (line == null) {
                        secondTask(rez, writer);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void firstTask(String line, FileWriter writer) throws IOException {
        if (hasPalindrom(line)) {
            writer.write(line + "\n");
        }
    }

    public static void secondTask(String text, FileWriter writer) throws IOException {
        if (amountWords(text) > 0) {
            String[] str = text.split("(\\.)|(!)|(\\?)");
            for (String s : str) {
                if (s.contains("-")) {
                    String[] strings = s.split("-");
                    StringBuilder sBuilder = new StringBuilder();
                    for (String string : strings) {
                        sBuilder.append(string);
                    }
                    s = sBuilder.toString();
                }
                s = s.trim();
                if (hasPalindrom(s) || (amountWords(s) >= 3 && amountWords(s) < 5)) {
                    writer.write(s + "\n");
                }
            }
        }
    }

    public static void thirdTask() {
        try (FileReader fr = new FileReader("D:\\Универ\\5 семестр\\СиТАиРИС\\Courses-Java-Kolosovich-Uliana\\Lesson14\\src\\main\\resources\\hw3\\input.txt");
             BufferedReader reader = new BufferedReader(fr);
             FileReader frBlackList = new FileReader("D:\\Универ\\5 семестр\\СиТАиРИС\\Courses-Java-Kolosovich-Uliana\\Lesson14\\src\\main\\resources\\hw3\\black_list.txt");
             BufferedReader readerBlackList = new BufferedReader(fr)) {
            String line = reader.readLine();
            String blackList = readerBlackList.readLine();
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilderLine = new StringBuilder();

            while (blackList != null) {
                stringBuilder.append(blackList + " ");
            }

            while (line != null) {
                stringBuilderLine.append(line);
                line = reader.readLine();
            }

            hasBlackList(stringBuilder, stringBuilderLine);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void forthTask() {
        // В файле тоже должно быть красиво записано? Потому что возникают проблемы с кодировкой
        // Или достаточно правильного чтения из файла и вывода на консоль?
        Car car = new Car("Audi", "type", 90, "type fuel", 290, 300, 90000);
        try (FileOutputStream outputStream = new FileOutputStream("D:\\Универ\\5 семестр\\СиТАиРИС\\Courses-Java-Kolosovich-Uliana\\Lesson14\\src\\main\\resources\\hw4\\output.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream("D:\\Универ\\5 семестр\\СиТАиРИС\\Courses-Java-Kolosovich-Uliana\\Lesson14\\src\\main\\resources\\hw4\\output.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Car readCar = (Car) objectInputStream.readObject();
            System.out.println(readCar);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void fifthTask() throws Exception {
        try {
            Reader reader = Files.newBufferedReader(Paths.get("D:\\Универ\\5 семестр\\СиТАиРИС\\Courses-Java-Kolosovich-Uliana\\Lesson14\\src\\main\\resources\\hw5\\car.json"));

            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode parser = objectMapper.readTree(reader);

            CarHw5 car = new CarHw5(parser.path("brand_name").asText() + " " + parser.path("model_name").asText(), parser.path("max_speed").asInt(), parser.path("price").asInt());

            System.out.println(car);

            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Object readJsonSimpleDemo(String filename) throws Exception {
        FileReader reader = new FileReader(filename);
        JSONParser jsonParser = new JSONParser();
        return jsonParser.parse(reader);
    }

    public static void hasBlackList(StringBuilder blackList, StringBuilder text) {
        String[] strings = blackList.toString().split(" ");
        String[] textString = text.toString().split("(\\.)|(!)|(\\?)");
        boolean a = true;
        int amount = 0;
        StringBuilder resultString = new StringBuilder();

        for (String string : strings) {
            for (String s : textString) {
                if (s.contains(string)) {
                    a = true;
                    amount++;
                    resultString.append(s + "\n");
                    // нужно ли писать отдельный метод, чтобы одинаковые предложения не записывались?
                }
            }
        }

        if (!a) {
            System.out.println("Текст прошёл проверку.");
        } else {
            System.out.println("Текст не прошёл проверку. " + amount + " предложений содержит нецензурные слова: \n" + resultString);
        }
    }

    public static boolean hasPalindrom(String str) {
        String[] mass = str.split(" ");
        boolean a = false;
        for (String s : mass) {
            if (s.length() > 1) {
                a = isPalindrom(s);
            }
            if (a) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPalindrom(String s) {
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }

    public static int amountWords(String str) {
        return str.split(" ").length;
    }
}
