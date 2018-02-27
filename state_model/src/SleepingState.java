public class SleepingState implements State {
    @Override
    public void WriteProgram(Work w) {
        System.out.println("当前时间"+w.hour+"点，睡着了");
    }
}
