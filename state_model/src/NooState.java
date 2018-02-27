public class NooState implements State {
    @Override
    public void WriteProgram(Work w) {
        if(w.hour < 13){
            System.out.println("当前时间"+w.hour+"饿了，困了");
        }

        else {
            w.setState(new AfternoonState());
            w.WriteProgram();
        }
    }
}
