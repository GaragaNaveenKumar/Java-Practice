//enum used for named constants
enum State{
    RUNNING,FAILED,PENDING,SUCCESS;
}
public class Demo7 {
    public static void main(String[] args) {
        State[] ss=State.values();
        for(State s:ss){
            System.out.println(s+" : "+s.ordinal());
        }

        //enum along with switch
        State s=State.FAILED;

        switch (s) {
            case RUNNING:
                System.out.println("still running");
                
                break;
            case FAILED:
                System.out.println("Try again");
                break;
            case PENDING:
                System.out.println("Pending wait");
                break;
        
            default:
                System.out.println("successfully completed");
                break;
        }
        
    }
}
