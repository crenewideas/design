package headfirst.designpatterns.capture01stratege.behaviors.ducks.fly;

import headfirst.designpatterns.capture01stratege.interfaces.duck.FlyBehavior;

/**
 * @description: FlyWithRocket
 * @author: pxlngu
 * @date: 2023-09-23 13:00
 */
public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with rocket");
    }
}
