import java.util.*;
import java.util.stream.Collectors;
public class jacard{
    public static void main(String[] args) {
        String doc1 = " data is the new oil of the digital economy";
        String doc2 = "data is the new oil";

        String concat = doc1 + " " + doc2;
        Set<String> stringset = new HashSet<String>();

        stringset.add(concat);

        double x = stringset.size();
        System.out.println("size "+x);

        // String[] subStrings = concatanated.split(" ");
        // int size = subStrings.length();

       
    }
}