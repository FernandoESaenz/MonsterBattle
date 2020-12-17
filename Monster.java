/*
This class will create the Monster and set the name, health points, and the
Weapon. It will also generate the random number which determines the attack
damage.
 */
public class Monster {
    private String name;
    private int healthPoints;
    private Weapon weapon;

    // Default constructor.
    public Monster() {
        this.name = "Jerry";
        this.healthPoints = 10;
    }

    // Overloaded constructor
    public Monster(String name, int health, Weapon weapon){
        this.name = name;
        this.healthPoints = health;
        this.weapon = weapon;
    }

    // Return the name of the Monster.
    public String getName() {
        return name;
    }

    // Return the health points of the monster.
    public int getHealthPoints() {
        return healthPoints;
    }

    // Return the name of the weapon.
    public String getWeaponName() {
        String name = weapon.getName();
        return name;
    }

    /* Method which will calculate the attack of each monster. The number is
    calculated randomly. Using Math.random() will generate a number between
    0.0 and 1.0 (A decimal). In order to generate a number which is a double and
    makes sense, we have to multiply the number generated by the max damage of
    each weapon. That will generate a number in between the field of 0.0 and
    the max damage of the weapon.
     */
    public int attack(Monster subject) {
        double damage = Math.random() * weapon.getMaxDamage();
        // We have to cast the double into a int!
        int done = (int)damage;
        subject.healthPoints = subject.healthPoints - done;
        return done;
    }
}