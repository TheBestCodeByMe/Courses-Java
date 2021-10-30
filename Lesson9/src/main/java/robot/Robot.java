package robot;

import robot.IRobot;
import robot.hands.IHand;
import robot.heads.IHead;
import robot.legs.ILeg;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot() {
    }

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
        System.out.println();
    }

    public int getPrice(){
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }
}
