package cosmodrome;

import cosmodrome.start.IStart;

public class Cosmodrome {
    public void startup(IStart object){
        if(object.check()){
            object.startEngine();
            System.out.println("Обратный отсчёт пошёл.");
            for (int i = 10; i > 0; i--){
                System.out.println(i);
            }
            object.start();
        } else {
            System.out.println("Предстартовая проверка провалена.");
        }
    }
}
