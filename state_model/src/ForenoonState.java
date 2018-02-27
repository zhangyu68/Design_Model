public class ForenoonState implements State {
    @Override
    public void WriteProgram(Work w) {
        if(w.hour <12 ){
            System.out.println("当前时间"+w.hour+"点，精神");
        }
        else {
            w.setState(new NooState());
            w.WriteProgram();
        }
    }
}
