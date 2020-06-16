package Entity;
import java.util.HashMap;
import java.util.Map;
public class Hashmap {
    public static void main(String[] args) {
    
        HashMap<Integer,String> hashMap = new HashMap<>();
       
        hashMap.put(11, "Faturrahman");
        hashMap.put(12, "Dedi");
        hashMap.put(13, "Munandar");
        
        for (Map.Entry map : hashMap.entrySet()){
            System.out.println(map.getKey()+" = "+map.getValue());
        }
    }
    
}
