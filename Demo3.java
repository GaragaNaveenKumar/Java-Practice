class Human{
    private int age;
    private String name;
    public Human(){

    }
    public Human(int a,String n){
        this.age=a;
        this.name=n;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}
public class Demo3 {
    public static void main(String[] args) {
        Human h=new Human(9,"king");
        System.out.println(h.getName()+" : "+ h.getAge());
        
    }
}
