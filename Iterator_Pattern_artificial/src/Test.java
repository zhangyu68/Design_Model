import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        List<String> items = new ArrayList<>();
        items.add("大鸟");
        items.add("小菜");
        items.add("小偷");
        items.add("行李");
        items.add("矮子");
        nameRepository.setItems(items);
        System.out.println("不管是谁，只要上车就得买票");
        for(Iterator iterator = nameRepository.getIterator();iterator.hasNext(nameRepository);){
            String name = (String)iterator.next(nameRepository);
            System.out.println(name+"买票!");
        }
    }
}
