public class Archer extends Character {
    public Archer(String name, int level, double baseRunSpeed) {
        super(name, level, baseRunSpeed);
    }

    @Override
    public void equipSword(Sword sword) {
        super.equipSword(sword);
        // Increase base damage from the equipped sword
        equippedSword.increaseDamage(5); // Adjust the value as needed
    }
}

public class Knight extends Character {
    public Knight(String name, int level, double baseRunSpeed) {
        super(name, level, baseRunSpeed);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        // Increase base maxHp
        maxHp += 20; // Adjust the value as needed
        hp = maxHp; // Heal to the new maxHp
    }
}

public class Thief extends Character {
    public Thief(String name, int level, double baseRunSpeed) {
        super(name, level, baseRunSpeed);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        // Increase base run speed
        runSpeed += 2; // Adjust the value as needed
        maxRunSpeed += 2; // Adjust the value as needed
    }
}
