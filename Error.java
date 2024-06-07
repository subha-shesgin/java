
public class Error {
    public static void main(String[] args) {
        int a[] = {7,9,45,63,10};
        int b =7;

        try{
            for(int i =0;i<7;i++)
            {
                int x = a[i] / (b-7);
                System.out.println(x);
            }
            
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index error");
        }
    }
    
}
