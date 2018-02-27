public class RestState implements State {
    @Override
    public void WriteProgram(Work w) {
        System.out.println("当前时间"+w.hour+"下班咯");
    }
}
