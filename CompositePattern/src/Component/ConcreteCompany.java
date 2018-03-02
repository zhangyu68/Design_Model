package Component;

import Leaf.Company;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
    private List<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name){
        super(name);
    }

    @Override
    public void Add(Company c) {
        children.add(c);
    }

    @Override
    public void Remove(Company c) {
        children.remove(c);
    }

    @Override
    public void Display(int depth) {
        System.out.println("-"+name);
        for (Company component:children
             ) {
            component.Display(depth+2);
            
        }
    }

    @Override
    public void LineOfDuty() {
        for (Company component:children
             ) {
            component.LineOfDuty();
        }
    }
}
