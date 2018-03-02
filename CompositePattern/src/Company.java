package Leaf;

public abstract class Company {
    protected String name;//只在这个类的子类可以访问

    public Company(String name){
        this.name = name;
    }

    public abstract void Add(Company c);
    public abstract void Remove(Company c);
    public abstract void Display(int depth);
    public abstract void LineOfDuty();//履行职责
}
