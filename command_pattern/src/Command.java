public abstract class Command {
    protected Barbecuer receiver;
    protected Integer number;
    public Command(Barbecuer receiver){
        this.receiver = receiver;
    }

    abstract void  excuteCommand();
}
