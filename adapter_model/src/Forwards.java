public class Forwards implements player{
    private String name;
    public Forwards(String name){
    this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("进攻吧！！"+name);
    }

    @Override
    public void defense() {
        System.out.println("防守吧！！"+name);
    }
}
