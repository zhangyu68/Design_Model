public class NameIterator implements Iterator {
    int index;

    @Override
    public boolean hasNext(NameRepository nameRepository) {
        if(index < nameRepository.getItems().size()){
            return true;
        }
        return false;
    }

    @Override
    public Object next(NameRepository nameRepository) {
        if(this.hasNext(nameRepository)){
            return nameRepository.getItems().get(index++);
        }
        return null;
    }


}
