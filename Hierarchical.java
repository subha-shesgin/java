class classA{
    double methodA(double p){
       double partA = Math.sqrt(p);
       return partA;
    }
}
class classB extends classA{
   double methodB (double t){
    double getpartA = super.methodA(t);
    double M = 6*(Math.pow(getpartA,4));
    return M;
   }
}
class ClassC extends classA{
    double methodC (double x,double t)
    {
        

        double getpartA = super.methodA(t);
    double m = getpartA + x;
    return m;
    }
}
class Classd extends classA{
    double methodD (double x,double t)
    {
        

        double getpartA = super.methodA(m);
    double m = getpartA + x;
    return m;
    }
}

