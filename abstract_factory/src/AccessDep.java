public class AccessDep implements IDepartment {
    @Override
    public void Insert(Department department) {
        System.out.println("部门插入成功");
    }

    @Override
    public Department GetDepartment(int id) {
        System.out.println("部门查询");
        return null;

    }
}
