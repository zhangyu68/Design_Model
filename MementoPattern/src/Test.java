public class Test {
    public static void main(String[] args) {
        //角色状态初始化
        System.out.println("————角色初始化————");
        GameRole player1 = new GameRole();
        player1.InitState();
        player1.StateDisplay();

        //要打Boss了，先备份

        //状态保存，先创建一个备忘录管理类
        System.out.println("和陈小春一起打BOSS！Go！");
        MementoManage mementoManage = new MementoManage();

        //创建一个备忘录类，保存当前需要保存的属性
        Memento memento = player1.createMemoto(player1);
        mementoManage.setMemento(memento);


        System.out.println("————胜败乃兵家常事————");
        //上啊！哦失败了
        player1.FightFailed();
        player1.StateDisplay();

        //没关系，恢复备份
        System.out.println("————大侠请重新来过————");
        player1.recoveryRoleState(mementoManage.getMemento());
        player1.StateDisplay();




    /*
        状态管理类只能保存一个状态，如何保存多个状态？

     */


    }
}
