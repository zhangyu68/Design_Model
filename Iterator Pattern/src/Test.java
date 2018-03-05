import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*
        迭代器的foreach实现
         */
        List<String> person = new ArrayList<>();
        person.add("大鸟");
        person.add("小菜");
        person.add("行李");
        person.add("老外");
        person.add("小偷");

        for (String item:person
             ) {
            System.out.println(item+"请买票！");
        }

        /*
        迭代器的手动实现
         */


    }
}
