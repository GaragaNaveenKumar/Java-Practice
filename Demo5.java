//nested calss
class A{
    public void show(){
        System.out.println("in A show");
    }
     class B {
        public void show(){
            System.out.println("in B show");
        }
    
        
    }
}
//nested anonymous class
class C{
    public void show(){
        System.out.println("in C show");
    }
      
    
}
public class Demo5 {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
        A.B obj1=obj.new B();
        obj1.show();
        C o=new C(){
            public void show(){
                System.out.println("in C sub class");
            }
        };
        o.show();
        
        
    }
    
}
