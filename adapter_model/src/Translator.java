public class Translator implements player {
    private ForeignForwards foreignForwards = new ForeignForwards();

    public Translator(String name){
        foreignForwards.setName(name);
    }

    @Override
    public void defense() {
        foreignForwards.防守();
    }

    @Override
    public void attack() {
        foreignForwards.进攻();
    }
}
