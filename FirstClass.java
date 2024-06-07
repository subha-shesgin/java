import java.lang.Math;
class Secondclass{
    void methodA(int a , int b)
    {
        int sum = a+b;
        System.out.println("both integer"+sum);
    }
    void methodA(int a , double b)
    {
        double sum = a+b;
        System.out.println("interger and double"+sum);
    }
    void methodA(double a , double b)
    {
        double sum = a+b;
        System.out.println("double and double"+sum);
    }
  
}

class thirdclass{
    void method(int t,int x)
    {
        double j = 6*t*t;
        double i= Math.sqrt(t)+x;
        double m = Math.sqrt(j/i);
        System.out.println("m = "+m);

    }
}



public class FirstClass {
    public static void main(String[] args) {
        // Secondclass objA = new Secondclass();
        //This feature of java is called polymorphism: where method name is same but parameters are different
        // objA.methodA(2,3);
        // objA.methodA(2,3.5);
        // objA.methodA(2.7,3.3);
        // System.out.println("First Program");
        // int a;
        // Integer ab;
        
        thirdclass obj = new thirdclass();
        obj.method(36,25);
    }
}
