package stategyPattern.poketmon_v2;

public class PoketmonFactory {

    private PoketmonFactory(){}

    private static class LazyPoketmonFactory{
        public static final PoketmonFactory poketmonFactory = new PoketmonFactory();
    }

    public static PoketmonFactory getInstance(){
        return LazyPoketmonFactory.poketmonFactory;
    }

    public Poketmon getPoketmon(String name){
        switch (name){
            case "피카츄":
                return new Pikachu();
            case "이상해씨":
                return new MrWei();
            case "파이리":
                return new Fieri();
            default:
                return null;
        }
    }
}
