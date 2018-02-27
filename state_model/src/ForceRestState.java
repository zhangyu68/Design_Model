public class ForceRestState implements State {
    @Override
    public void WriteProgram(Work w) {
        System.out.println("当前时间"+w.hour+"点，超过八点干没干完都走人");
    }
}
