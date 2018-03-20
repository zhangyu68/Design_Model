import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command){
        orders.add(command);
    }

    public void cancelOrder(Command command){
        orders.remove(command);

    }

    public void Notify(){
        for (Command cmd:orders
             ) {
            cmd.excuteCommand();
        }
    }
}
