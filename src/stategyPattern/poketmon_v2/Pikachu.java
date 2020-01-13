package stategyPattern.poketmon_v2;

public class Pikachu extends Poketmon {

    @Override
    public void attack(){
        switch (getEvolution()){
            case 0:
                System.out.println("십만볼트!!!");
                break;
            case 1:
                System.out.println("백만볼트!!!");
                break;
            case 2:
                System.out.println("천만볼트!!!");
                break;
        }
    }

    @Override
    public void defense() {
        System.out.println("고속이동!!!");
    }
}
