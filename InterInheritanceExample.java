class classA{
    double methodA(double t){
        double partA =6*t*t;
        return partA;
    }
}
//here we are using single inheritance2
class ClassB extends classA{
    double methodB(double x,double t)
    {
        double partB = Math.sqrt(t)+x;
        double getpartA = super.methodA(t);
        double m = Math.sqrt(getpartA/partB);
        return m;
    }
}



public class InterInheritanceExample {
 
    public static void main(String[] args) {
        ClassB objB = new ClassB();
        System.out.println("both integer :" +objB.methodB(2.5, 3.5));
    }

}
