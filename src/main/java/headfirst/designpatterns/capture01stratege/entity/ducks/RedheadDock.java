package headfirst.designpatterns.capture01stratege.entity.ducks;

import headfirst.designpatterns.capture01stratege.behaviors.ducks.fly.FlyWithRocket;
import headfirst.designpatterns.capture01stratege.behaviors.ducks.quack.Quack;
import headfirst.designpatterns.capture01stratege.interfaces.duck.Duck;

/**
 * @description:
 * @author: pxlngu
 * @date: 2023-09-23 13:06
 */
public class RedheadDock extends Duck {

    public RedheadDock() {
        super.flyBehavior = new FlyWithRocket();
        super.quackBehavior = new Quack();
    }

    @Override
    protected void display() {
        System.out.println("RedheadDock display");
        performFly();
        performQuack();
    }
}
