package poketmon_v3.poketmon;

import poketmon_v3.skill.attack.AttackStrategy;
import poketmon_v3.skill.defense.DefenseStrategy;

public abstract class Poketmon {

    private String name;
    private int evolution;

    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public AttackStrategy getAttackStrategy() {
        return attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public DefenseStrategy getDefenseStrategy() {
        return defenseStrategy;
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }

    public int getEvolution() {
        return evolution;
    }

    public void setEvolution(int evolution) {
        this.evolution = evolution;
    }

    //동작부
    public void attack(){
        attackStrategy.attack();
    }
    public void defense(){
        defenseStrategy.defense();
    }
}
