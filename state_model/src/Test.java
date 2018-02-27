public class Test {
    public static void main(String[] args) {
        Work work = new Work();
        work.hour = 9;
        work.WriteProgram();

        work.hour = 11;
        work.WriteProgram();

        work.hour = 12;
        work.WriteProgram();

        work.hour = 13;
        work.WriteProgram();

        work.finish = false;
        //work.finish = true;
        work.hour = 17;
        work.WriteProgram();

        work.hour = 19;
        work.WriteProgram();

        work.hour = 20;
        work.WriteProgram();

        work.hour = 22;
        work.WriteProgram();
    }
}
