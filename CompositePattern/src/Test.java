import Component.ConcreteCompany;
import Leaf.Company;
import Leaf.FinanceDepartment;
import Leaf.HRDepartment;

public class Test {
    public static void main(String[] args) {
        //总公司
        Company rootCompany = new ConcreteCompany("北京总公司");
        rootCompany.Add(new HRDepartment("北京总公司人力资源部"));
        rootCompany.Add(new FinanceDepartment("北京总公司财务部"));

        //分公司
        Company comp1 = new ConcreteCompany("上海分公司");
        comp1.Add(new HRDepartment("上海分公司人力资源部"));
        comp1.Add(new FinanceDepartment("上海分公司财务部"));
        rootCompany.Add(comp1);//为根节点添加分支

        Company comp2 = new ConcreteCompany("上海第一办事处");
        comp2.Add(new HRDepartment("上海第一办事处人力资源部"));
        comp2.Add(new FinanceDepartment("上海第一办事处财务部"));

        comp1.Add(comp2);//分支添加叶子
        System.out.println("结构图");
        rootCompany.Display(1);

        System.out.println("职责");
        rootCompany.LineOfDuty();
    }
}
