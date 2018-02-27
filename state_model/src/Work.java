public class Work {
    private State current;
    public Work(){
        current = new ForenoonState();
    }
    public double hour;


    public boolean finish = false;

    public void setState(State s){
        current = s;
    }

    public void WriteProgram(){
        current.WriteProgram(this);
    }
}
