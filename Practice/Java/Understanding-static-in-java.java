class Main{
    public static void main(String[] args){
        Calc c1 = new Calc();
        Calc c2 = new Calc();
        c1.multiply(2, 3);
        c2.add(5, 6);
        //Calc.add(3, 4); //error
        Calc.multiply(5,7); //Can be accessed directly without creating an object as the function is defined as static
    }
}

class Calc{
    void add(int a, int b){
        System.out.println(a+b);
    }
    static void multiply(int a, int b){
        System.out.println(a*b);
    }
}
