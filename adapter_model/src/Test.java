public class Test {
    public static void main(String[] args) {
        player forwards = new Forwards("巴蒂尔");
        forwards.attack();
        forwards.defense();

        player player2 = new Translator("姚明");
        player2.attack();
        player2.defense();
    }
}
/*
    使用一个已经存在的类，但如果她的接口不相同时，考虑适配者模式。
    即两个类所做的事情类似，但接口不同；但是要在双方都不太容易改动的情况下使用适配者模式，不可一上来就使用。
 */