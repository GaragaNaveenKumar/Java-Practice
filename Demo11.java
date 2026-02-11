
//Exception Handling 
public class Demo11 {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try{
            if(i==0)throw new Exception("i is 0");
            j=10/i;

        }
        catch(Exception e){
            System.out.println("error"+e);
        }
        
    }
}
