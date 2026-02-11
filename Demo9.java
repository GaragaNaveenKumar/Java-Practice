//annotations @Override
class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A 
{

    @Override
    public void show() {
        System.out.println("in B show");
    }

    
}
public class Demo9 {
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
        
    }
    
}
