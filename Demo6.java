//interface
interface  Computer{
    public void code();
   
}
class Laptop implements Computer {
    public void code(){
        System.out.println("code,compile,run");
    }

    
}
class Desktop  implements Computer {
    public void code(){
        System.out.println("code,compile,run faster");
    }

    
}
class Developer {
    public void dev(Computer com){
        com.code();
    }
}
public class Demo6 {
    public static void main(String[] args) {
        Developer d=new Developer();
        Laptop l=new Laptop();
        d.dev(l);
        
    }
    
}
