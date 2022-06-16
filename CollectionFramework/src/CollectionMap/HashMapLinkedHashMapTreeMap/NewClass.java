
package CollectionMap.HashMapLinkedHashMapTreeMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class NewClass {
    public static void main(String[] args) {
        Map<Integer,String> hashmap=new HashMap<Integer, String>();
        Map<Integer,String> linkedhashmap=new LinkedHashMap<Integer, String>();
        Map<Integer,String> treemap=new TreeMap<Integer, String>();
        
        System.out.println("\t HASHMAP");
        /*HASHMAP te elemanlar sırasız bir şekilde gelir*/
        yazdırMap(hashmap);
        
        System.out.println("\t LİNKEDHASHMAP");
        /*LİNKEDHASHMAP te elemanlar eklenme sırasına göre gelir*/
        yazdırMap(linkedhashmap);
        
        System.out.println("\t TREEMAP");
        /*TREEMAP te elemanlar key in değerine göre strin ise alfabetik ınteger ise küçükten büyüğe doğru gelir*/
        yazdırMap(treemap);
        
        
        //şu şekilde key ve value'leri ayrı alabilirizi 
        System.out.println("HASHMAP : "+hashmap.keySet());
        System.out.println("HASHMAP : "+hashmap.values());
        
        System.out.println("*********");
        System.out.println("LİNKEDHASHMAP : "+linkedhashmap.keySet());
        System.out.println("LİNKEDHASHMAP : "+linkedhashmap.values());
        
        System.out.println("*********");
        System.out.println("TREEMAP : "+treemap.keySet());
        System.out.println("TREEMAP : "+treemap.values());
    }
    
    
    public static void yazdırMap(Map<Integer,String>map){
        
       map.put(10, "java");
       map.put(20, "python");
       map.put(15, "php");
       map.put(5, "css");
    
    
    for(Map.Entry<Integer,String> entry : map.entrySet()){
        System.out.println("key : "+entry.getKey()+"    value : "+entry.getValue());
    }
      // şu şekilde de alabiliriz
        System.out.println("------------------------------");
      for(Integer keyimiz : map.keySet()){
          /* bu şekilde key ve keye bağlı degeri alabiliriz*/
          System.out.println("key.... : "+keyimiz+" deger ....: "+map.get(keyimiz));}
       System.out.println("--------------------------------");
       
        // şu şekilde de alabiliriz ama sadece değerleri
        Collection<String> deger = map.values();
       for(String s : deger){
           System.out.println(" değer  : "+s);} 
        
        System.out.println("////////////////////");
    }
}
