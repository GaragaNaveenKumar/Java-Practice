class  Calculator {
    public static int add(int n1,int n2){
        return n1+n2;
    }

    
}

class Sam{
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        int result=Calculator.add(4, 5);
        System.out.println(result);
        
    }
}