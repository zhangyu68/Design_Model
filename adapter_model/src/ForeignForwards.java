public class ForeignForwards {
    //外籍球员，不懂player接口
    private String name;


    public void setName(String name) {
        this.name = name;
    }

    public void 进攻(){
        System.out.println("进攻吧！!"+name);
    }

    public void 防守(){
        System.out.println("防守吧！！"+name);
    }
}
