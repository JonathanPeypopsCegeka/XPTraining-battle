package be.cegeka.battle;

public class FightSimulator {
    public FightSimulator() {
    }

    public static Soldier fight(Soldier attacker, Soldier defender) {
        if (attacker.getWeapon().getDamage() < defender.getWeapon().getDamage()) {
            return defender;
        }
        return attacker;
    }
}
