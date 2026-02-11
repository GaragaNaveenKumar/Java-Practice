//FunctionalInerface -> single abstract method
//we can use lamda function to implement FunctionalInterface Method
@FunctionalInterface
interface A {
    void show();

    
}
public class Demo10 {
    public static void main(String[] args) {
        A obj=()->{
            System.out.println("show method");
        };
        obj.show();
        
    }
    
}
