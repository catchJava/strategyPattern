package poketmon_v1;

import poketmon_v1.Poketmon;
import poketmon_v1.PoketmonFactory;

public class PoketmonMain {
    public static void main(String[] args) {

        PoketmonFactory poketmonFactory = PoketmonFactory.getInstance();

        Poketmon pika = poketmonFactory.getPoketmon("피카츄");
        Poketmon fieri = poketmonFactory.getPoketmon("파이리");
        Poketmon mrWei = poketmonFactory.getPoketmon("이상해씨");

        System.out.println("포켓몬 월드에 오신것을 환영합니다!!!!!");

        System.out.println("피카츄 공격 및 회피---------------");
        pika.attack();
        pika.defense();

        System.out.println("파이리 공격---------------");
        fieri.attack();
        fieri.defense();

        System.out.println("이상해씨 공격---------------");
        mrWei.attack();
        mrWei.defense();

    }
}