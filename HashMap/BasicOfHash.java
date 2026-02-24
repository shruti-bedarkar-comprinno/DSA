import java.util.Set;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        //creation
        HashMap<Integer, String> map = new HashMap<>();
        
        //Insertion
        
        map.put(1,"Shruti");
        map.put(2,"payal");
        map.put(3,"Raj");
        System.out.println(map);
        map.put(4,"Priya");
       System.out.println(map);
        map.put(4,"Piyush");
        System.out.println(map);
        
        //Searching in hashmap
        
        System.out.println(map.get(1));//key present
        System.out.println(map.get(6));//key not present
        
        //Itration on hashmap
        //1st method
        for(HashMap.Entry<Integer, String> e : map.entrySet()){
           System.out.println(e.getKey());
           System.out.println(e.getValue());
            
            System.out.println(e.getKey() + " " + e.getValue());
        }
        //2nd method
        Set<Integer> keys = map.keySet();
        for(Integer key : keys) {
            System.out.println(key +" "+map.get(key));
        }
       //remove
       map.remove(1);
       System.out.println(map);

        //size of hashmap
         System.out.println(map.size());
    }
}
