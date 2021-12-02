import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Homework {
    // все методы статик сделала, чтобы не создавать конструкторы)))))
    // использовать класс, как хелперовский
    private static String path = "D:\\Универ\\5 семестр\\СиТАиРИС\\Courses-Java-Kolosovich-Uliana\\Lesson14\\src\\main\\resources\\";
    private static String rez = "";

    public static void fileReaderWriter(String input, String output, int task) {
        File file = new File(path + output);
        try (FileReader fr = new FileReader(path + input);
             BufferedReader reader = new BufferedReader(fr);
             FileWriter writer = new FileWriter(file, true)) {
            String line = reader.readLine();
            while (line != null) {
                if (task == 1) {
                    firstTask(line, writer);
                } else if (task == 2) {
                    summ(line);
                }
                line = reader.readLine();
            }
            if (task == 2) {
                secondTask(rez, writer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void summ(String line) {
        if (!line.matches("\s{2,}")) {
            rez += line;
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
                if ((amountWords(s) >= 3 && amountWords(s) < 5) || hasPalindrom(s)) {
                    writer.write(s + "\n");
                }
            }
        }
    }

    public static void thirdTask() {
        try (FileReader fr = new FileReader(path + "hw3\\input.txt");
             BufferedReader reader = new BufferedReader(fr);
             FileReader frBlackList = new FileReader(path + "hw3\\black_list.txt");
             BufferedReader readerBlackList = new BufferedReader(fr)) {
            String line = reader.readLine();
            String blackList = readerBlackList.readLine();
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilderLine = new StringBuilder();

            while (blackList != null) {
                stringBuilder.append(blackList + " ");
                blackList = readerBlackList.readLine();
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
        Car car = new Car("Audi", "type", 90, "type fuel", 290, 300, 90000);
        try (FileOutputStream outputStream = new FileOutputStream(path + "hw4\\output.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream(path + "hw4\\output.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Car readCar = (Car) objectInputStream.readObject();
            System.out.println(readCar);
            // здесь ClassNotFoundException из-за readObject()
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void fifthTask() {
        // https://blog.ithillel.ua/articles/delaem-serializatsiyu-v-json-i-obratno-c-jackson
        // для себя, уже не буду переделывать

        try {
            Reader reader = Files.newBufferedReader(Paths.get(path + "hw5\\car.json"));

            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode parser = objectMapper.readTree(reader);

            CarHw5 car = new CarHw5(parser.path("brand_name").asText() + " " + parser.path("model_name").asText(), parser.path("max_speed").asInt(), parser.path("price").asInt());

            System.out.println(car);

            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void hasBlackList(StringBuilder blackList, StringBuilder text) {
        String[] strings = blackList.toString().split(" ");
        String[] textString = text.toString().split("[.!?]");
        boolean flag = false;
        int amount = 0;
        StringBuilder resultString = new StringBuilder();

        for (String string : strings) {
            for (String s : textString) {
                if (s.contains(string)) {
                    flag = true;
                    amount++;
                    resultString.append(s + "\n");
                }
            }
        }

        if (flag) {
            System.out.println("Текст прошёл проверку.");
        } else {
            System.out.println("Текст не прошёл проверку. " + amount + " предложений содержит нецензурные слова: \n" + resultString);
        }
    }

    public static boolean hasPalindrom(String str) {
        String[] mass = str.split(" ");
        boolean a = false;
        for (String s : mass) {
            if (s.length() > 1 && isPalindrom(s)) {
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
