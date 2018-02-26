public class test {
    public static void main(String[] args) {
        User user = new User();
        IFactory factory = new SqlserverFactory();
        IUser iUser = factory.createUser();
        iUser.Insert(user);
        iUser.GetUser(1);
        IDepartment iDepartment = factory.createDep();
        Department department = new Department();
        iDepartment.Insert(department);
        iDepartment.GetDepartment(1);
    }
}
