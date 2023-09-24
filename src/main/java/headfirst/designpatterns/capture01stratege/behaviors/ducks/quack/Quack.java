package headfirst.designpatterns.capture01stratege.behaviors.ducks.quack;

import headfirst.designpatterns.capture01stratege.interfaces.duck.QuackBehavior;

/**
 * @description:
 * @author: pxlngu
 * @date: 2023-09-23 13:01
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack can quack");
    }
}
