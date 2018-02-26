public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDep() {
        return new AccessDep();
    }
}
