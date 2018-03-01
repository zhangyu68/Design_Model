public class GameRole {
    //发起人
    private int vit;//生命值
    private int attack;//攻击力
    private int defense;//防御力


    public void StateDisplay(){
        System.out.println("当前角色生命值为:"+this.vit);
        System.out.println("当前角色攻击力为:"+this.attack);
        System.out.println("当前角色防御力为:"+this.defense);
    }

    public void InitState(){
        this.vit= 1000;
        this.attack = 100;
        this.defense = 100;
    }

    public void FightFailed(){
        this.vit= 0;
        this.attack = 0;
        this.defense = 0;
    }

    public Memento createMemoto(GameRole gameRole){
        return new Memento(gameRole);
    }

    public void recoveryRoleState( Memento memento){
        this.attack = memento.getAtk();
        this.vit = memento.getVit();
        this.defense = memento.getDef();
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }


}
