package stategyPattern.poketmon_v3.skill.defense;

public class HighSpeedMoveDefense implements DefenseStrategy {
    @Override
    public void defense() {
        System.out.println("고속이동!!!");
    }
}
