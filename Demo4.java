abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing ..");
    }
}
class Tata extends Car {
@Override
    public void drive() {
        System.out.println("Driving ...");
    }

    
}
public class Demo4 {
    public static void main(String[] args) {
        Car obj=new Tata();
        obj.drive();
        obj.playMusic();
        
    }
}
