public class SqlserverFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDep() {
        return new SqlserverDep();
    }
}
