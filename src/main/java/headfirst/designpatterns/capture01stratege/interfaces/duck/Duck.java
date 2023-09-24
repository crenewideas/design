package headfirst.designpatterns.capture01stratege.interfaces.duck;

/**
 * @description:
 * @author: pxlngu
 * @date: 2023-09-23 13:03
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck() {
    }

    protected Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("swim~~~");
        display();
    }

    protected abstract void display();

    //非共性的行为，通过多态作为属性传入。
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    //非共性的行为，通过多态作为属性传入。
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    protected void performFly() {
        flyBehavior.fly();
    }

    protected void performQuack() {
        quackBehavior.quack();
    }

}
