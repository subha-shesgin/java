class classA{
    double methodA(double t){
        double partA =6*t*t;
        return partA;
    }
}
    class ClassB extends classA{
        double methodB (double x,double t)
        {
            double partB = Math.sqrt(t)+x;
            double getpartA = super.methodA(t);
            double M = (getpartA/partB);
            return M;
        }
    }
    class ClassC extends ClassB{
        double methodC (double x,double t)
        {
            

            double getpartB = super.methodB(x,t);
        double m = Math.sqrt(getpartB);
        return m;
        }
    }


public class MultilevelInheritance {
    public static void main(String[] args) {
        ClassC objC = new ClassC();
        System.out.println("both integer :" +objC.methodC(2.5, 3.5));
    }
}
