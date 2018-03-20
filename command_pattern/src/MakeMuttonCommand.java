public class MakeMuttonCommand extends Command{

    public MakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.makeChickenWing(number);
    }



}
