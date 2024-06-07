class sample1{
    void methodA(){
        System.out.println("MethodA-s1");
    }
}
class sample2 extends sample1{
    // void methodA(){
    //     System.out.println("MethodA-s2");
    // }
    void methodB(){
        System.out.println("MethodB");// if class name and method name is same then it is called constractor
    }
}
public class Micellinious {
    public static void main(String[] args) {
        sample1 objs = new sample2();
        objs.methodA();
    }
    
}
