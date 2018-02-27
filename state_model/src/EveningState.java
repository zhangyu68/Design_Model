public class EveningState implements State {
    @Override
    public void WriteProgram(Work w) {
        if(w.finish == true){
            w.setState(new RestState());
        }
        else {
            if(w.hour <20){
                System.out.println("当前时间"+w.hour+"加班，mmp");
            }
            /*
            else {
                w.setState(new SleepingState());
                w.WriteProgram();
            }
            */

            else {
                w.setState(new ForceRestState());
                w.WriteProgram();
            }
        }
    }
}
