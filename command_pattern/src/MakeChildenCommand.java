public class MakeChildenCommand extends Command {

    public MakeChildenCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    void excuteCommand() {
        receiver.makeChickenWing(number);
    }
}
