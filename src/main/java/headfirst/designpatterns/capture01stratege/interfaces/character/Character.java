package headfirst.designpatterns.capture01stratege.interfaces.character;

/**
 * @description:
 * @author: pxlngu
 * @date: 2023-09-23 17:44
 */
public abstract class Character {
    protected Weapon weapon;

    public Character() {
    }

    public Character(Weapon weapon) {
        this.weapon = weapon;
    }

    public abstract void play();
    public void useWeapon(){
        weapon.useWeapon();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
