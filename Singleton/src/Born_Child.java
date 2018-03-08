import java.util.concurrent.locks.ReentrantLock;

public class Born_Child {

    /*
    Java 中被 static 修饰的成员称为静态成员或类成员
    。它属于整个类所有，而不是某个对象所有，
    即被类的所有对象所共享。静态成员可以使用类名直接访问，
    也可以使用对象名进行访问。当然，鉴于他作用的特殊性更推荐用类名访问
     */
    private static Born_Child instance;//静态属性可以直接调用
    private static  ReentrantLock reentrantLock = new ReentrantLock();
    private Born_Child(){

    }

    public static Born_Child GetInstance(){
        if(instance == null){
            reentrantLock.lock();//多线程控制，多个同时访问，加锁。保证只生成一个对象。
            if(instance == null) {
                System.out.println("实例化成功");
                instance = new Born_Child();
            }
            reentrantLock.unlock();
        }
        else {
            System.out.println("实例化失败，此对象仅能实例化一次");
        }
        return instance;
    }




}
