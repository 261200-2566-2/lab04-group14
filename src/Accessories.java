public interface Accessories {
    void buy();
    void sell();
}
public class Ring implements Accessories {
    private int damageIncrease;
    private boolean isBought;

    public Ring(int damageIncrease) {
        this.damageIncrease = damageIncrease;
        this.isBought = false;
    }

    @Override
    public void buy() {
        System.out.println("Ring bought!");
        isBought = true;
    }

    @Override
    public void sell() {
        System.out.println("Ring sold!");
        isBought = false;
    }

    public void increaseSwordDamage(Sword sword) {
        if (isBought) {
            // Increase the damage of the provided sword
            sword.increaseDamage(damageIncrease);
            System.out.println("Sword damage increased by " + damageIncrease);
        } else {
            System.out.println("You need to buy the ring before using its effects.");
        }
    }
}

public class Earring implements Accessories {
    private int defenseIncrease;
    private boolean isBought;

    public Earring(int defenseIncrease) {
        this.defenseIncrease = defenseIncrease;
        this.isBought = false;
    }

    @Override
    public void buy() {
        System.out.println("Earring bought!");
        isBought = true;
    }

    @Override
    public void sell() {
        System.out.println("Earring sold!");
        isBought = false;
    }

    public void increaseShieldDefense(Shield shield) {
        if (isBought) {
            // Increase the defense of the provided shield
            shield.increaseDefense(defenseIncrease);
            System.out.println("Shield defense increased by " + defenseIncrease);
        } else {
            System.out.println("You need to buy the earring before using its effects.");
        }
    }
}



