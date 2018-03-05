import java.util.ArrayList;
import java.util.List;

public class NameRepository implements Container {
    private List<String> items = new ArrayList<>();

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }
}
