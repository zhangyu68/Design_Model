package Leaf;

public class FinanceDepartment extends Leaf.Company {
    public FinanceDepartment(String name){
        super(name);
    }
    @Override
    public void Add(Leaf.Company c) {
        System.out.println("叶子节点不能分支");
    }

    @Override
    public void Remove(Leaf.Company c) {
        System.out.println("叶子节点不能删除");
    }

    @Override
    public void Display(int depth) {
        System.out.println("-"+name);
    }

    @Override
    public void LineOfDuty() {
        System.out.println(name+"职责：财务管理");
    }
}

