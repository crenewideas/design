package headfirst.designpatterns.capture01stratege.entity.ducks;

import headfirst.designpatterns.capture01stratege.behaviors.ducks.fly.FlyWithWings;
import headfirst.designpatterns.capture01stratege.behaviors.ducks.quack.Squeak;
import headfirst.designpatterns.capture01stratege.interfaces.duck.Duck;

/**
 * @description:
 * @author: pxlngu
 * @date: 2023-09-23 13:06
 */
public class MallardDock extends Duck {

    public MallardDock() {
        super.flyBehavior = new FlyWithWings();
        super.quackBehavior = new Squeak();
    }

    @Override
    protected void display() {
        System.out.println("MallardDock display");
        performFly();
        performQuack();
    }

}
