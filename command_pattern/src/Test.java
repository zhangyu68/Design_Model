public class Test {
    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();
        Command command1 = new MakeChildenCommand(boy);
        command1.number = 10;
        Command command2 = new MakeMuttonCommand(boy);
        command2.number = 5;
        Waiter girl = new Waiter();

        girl.setOrder(command1);
        girl.setOrder(command2);

        girl.Notify();
    }
}
