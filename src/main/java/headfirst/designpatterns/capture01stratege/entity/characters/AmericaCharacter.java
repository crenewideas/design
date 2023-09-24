package headfirst.designpatterns.capture01stratege.entity.characters;

import headfirst.designpatterns.capture01stratege.behaviors.characters.WeaponOfKnife;
import headfirst.designpatterns.capture01stratege.interfaces.character.Character;
import headfirst.designpatterns.capture01stratege.interfaces.character.Weapon;

/**
 * @description:
 * @author: pxlngu
 * @date: 2023-09-23 17:41
 */
public class AmericaCharacter extends Character {

    public AmericaCharacter() {
        weapon = new WeaponOfKnife();
    }

    public AmericaCharacter(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void play() {
        System.out.print("current player from America , ");
        useWeapon();
    }

}
