package robot;

import robot.hands.SamsungHand;
import robot.hands.SonyHand;
import robot.hands.ToshibaHand;
import robot.heads.SamsungHead;
import robot.heads.SonyHead;
import robot.heads.ToshibaHead;
import robot.legs.SamsungLeg;
import robot.legs.SonyLeg;
import robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        Robot robot1 = new Robot(new SamsungHead(300), new SonyHand(900), new ToshibaLeg(3609));
        Robot robot2 = new Robot(new SonyHead(5500), new SamsungHand(400), new SonyLeg(9036));
        Robot robot3 = new Robot(new ToshibaHead(903), new ToshibaHand(1233), new SamsungLeg(9620));

        robot1.action();
        robot2.action();
        robot3.action();

        // Может так? А если несколько самых дорогих, то тоже надо было
        // что-то думать?
        Robot[] mass = {robot1, robot2, robot3};
        Robot expensiveRobot = mass[0];
        for (Robot robot : mass) {
            if (robot.getPrice() > expensiveRobot.getPrice()) {
                expensiveRobot = robot;
            }
        }
        System.out.println("Самый дорогой робот имеет следующие характеристики: ");
        expensiveRobot.action();
        System.out.println("И следующую цену: " + expensiveRobot.getPrice());
/*
        if (robot1.getPrice() > robot2.getPrice()) {
            if (robot1.getPrice() > robot3.getPrice()) {
                System.out.println("Самый дорогой робот номер 1.");
            } else {
                System.out.println("Самый дорогой робот номер 3.");
            }
        } else if (robot2.getPrice() > robot3.getPrice()) {
            System.out.println("Самый дорогой робот номер 2.");
        } else {
            System.out.println("Самый дорогой робот номер 3.");
        }
 */
    }
}
