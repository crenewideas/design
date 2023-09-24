package headfirst.designpatterns.capture01stratege.behaviors.characters;

import headfirst.designpatterns.capture01stratege.interfaces.character.Weapon;

/**
 * @description:
 * @author: pxlngu
 * @date: 2023-09-23 17:47
 */
public class WeaponOfGun implements Weapon {
    @Override
    public void useWeapon() {
        System.out.println("use gun");
    }
}
