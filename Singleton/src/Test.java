public class Test {
    public static void main(String[] args) {
        Born_Child born_child = Born_Child.GetInstance();
        Born_Child born_child1 = Born_Child.GetInstance();
        if (born_child == born_child1) {
            System.out.println("两个对象为相同的实例");
        } else {
            System.out.println("两个实例不同");
        }
    }
}
