package cosmodrome;

import cosmodrome.start.IStart;

public class Cosmodrome {
    public void startup(IStart rocket) {
        if (rocket.check()) {
            rocket.startEngine();
            System.out.println("Обратный отсчёт пошёл.");
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
            rocket.start();
        } else {
            System.out.println("Предстартовая проверка провалена.");
        }
    }
}
