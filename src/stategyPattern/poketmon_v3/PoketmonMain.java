package stategyPattern.poketmon_v3;

import stategyPattern.poketmon_v3.poketmon.Poketmon;
import stategyPattern.poketmon_v3.skill.attack.AttackStrategy;
import stategyPattern.poketmon_v3.skill.attack.HTVoltsAttack;
import stategyPattern.poketmon_v3.skill.attack.MillionVoltsAttack;
import stategyPattern.poketmon_v3.skill.defense.DefenseStrategy;
import stategyPattern.poketmon_v3.skill.defense.HighSpeedMoveDefense;

public class PoketmonMain {
    public static void main(String[] args) {

        //사전작업
        PoketmonFactory poketmonFactory = PoketmonFactory.getInstance();
        AttackStrategy htVoltsAttack = new HTVoltsAttack();
        AttackStrategy millionVoltsAttack = new MillionVoltsAttack();
        DefenseStrategy highSpeedMoveDefense = new HighSpeedMoveDefense();


        //게임시작
        System.out.println("포켓몬 월드에 오신것을 환영합니다!!!!!");
        Poketmon pika = poketmonFactory.getPoketmon("피카츄");
        pika.setAttackStrategy(htVoltsAttack);
        pika.setDefenseStrategy(highSpeedMoveDefense);

        System.out.println("피카츄 공격---------------");
        pika.attack();
        pika.defense();

        System.out.println("피카츄 라이츄로 진화---------------");
        pika.setEvolution(1);
        pika.setAttackStrategy(millionVoltsAttack);
        pika.attack();
        pika.defense();
    }
}