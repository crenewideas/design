package headfirst.designpatterns.capture01stratege.behaviors.ducks.fly;

import headfirst.designpatterns.capture01stratege.interfaces.duck.FlyBehavior;

/**
 * @description: FlyNoWay
 * @author: pxlngu
 * @date: 2023-09-23 12:58
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly no way");
    }
}
