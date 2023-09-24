package headfirst.designpatterns.capture01stratege;

import headfirst.designpatterns.capture01stratege.behaviors.characters.WeaponOfGun;
import headfirst.designpatterns.capture01stratege.behaviors.ducks.fly.FlyNoWay;
import headfirst.designpatterns.capture01stratege.entity.characters.ChineseCharacter;
import headfirst.designpatterns.capture01stratege.entity.ducks.MallardDock;
import headfirst.designpatterns.capture01stratege.entity.ducks.RedheadDock;
import headfirst.designpatterns.capture01stratege.interfaces.character.Character;
import headfirst.designpatterns.capture01stratege.interfaces.duck.Duck;

/**
 * @description:
 * @author: pxlngu
 * @date: 2023-09-23 13:18
 */
public class MainTest {
    public static void main(String[] args) {
        doCharacterTest();
    }

    public static void doTest(){
        Duck redheadDock = new RedheadDock();
        redheadDock.swim();
        //改变行为。
        redheadDock.setFlyBehavior(new FlyNoWay());
        redheadDock.swim();
        Duck mallardDock = new MallardDock();
        mallardDock.swim();
    }

    public static void doCharacterTest(){
        Character chineseCharacter = new ChineseCharacter();
        chineseCharacter.play();
        //改变行为。
        chineseCharacter.setWeapon(new WeaponOfGun());
        chineseCharacter.play();
    }
}
