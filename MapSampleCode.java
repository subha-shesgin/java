import java.util.HashMap;
import java.util.Map;


public class MapSampleCode {
    public static void main(String[] args) {
        Map<String,Integer> samplemap = new HashMap<String,Integer>();
        samplemap.put("Std1", 60);
        samplemap.put("Std2", 70);
        samplemap.put("Std3", 80);
        samplemap.put("Std4", 90);
        System.out.println(samplemap);

        System.out.println(samplemap.get("Std1"));

        for(String mapkey:samplemap.keySet()){
            System.out.println(mapkey);
        }
        for(String mapkey:samplemap.keySet()){
            System.out.println(samplemap.get(mapkey));
        }
    }
}
