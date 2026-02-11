//another enum example

enum Laptop{
    Macbook(2000),Xps(2200),Suffer(1550),ThinkPad(1800);
    private int price;
    private Laptop() {
    }
    private Laptop(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
public class Demo8 {
    public static void main(String[] args) {
        Laptop[] ll=Laptop.values();
        for(Laptop l:ll){
            System.out.println(l+" : "+l.getPrice());
        }
        
    }
}
