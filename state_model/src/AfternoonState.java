public class AfternoonState implements State {
    @Override
    public void WriteProgram(Work w) {
        if (w.hour <17)
        {
            System.out.println("当前时间"+w.hour+"点，状态还行，继续努力");
        }

        else {
            w.setState(new EveningState());
            w.WriteProgram();
        }
    }
}
