
package CollectionMap.HashMap;

import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;


public class HashMapClass{
    public static void main(String[] args) {
        
    
        // HashMap'İ ŞU ŞEKİLDE OLUŞTURUYORUZ
       HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
       
       //eleman ekleme metodu add değil put'tur
       hashMap.put(10, "java");
       hashMap.put(20, "python");
       hashMap.put(15, "php");
       hashMap.put(5, "css");
       
        System.out.println(hashMap);// burada key ve valudeğerlerini getirir ama has olduğundan ekleme sırasına göre değil rasgele gelir
        
       //farklı keye aynı değeri ekleyebliriz
       hashMap.put(25, "java");
       System.out.println(hashMap);
       
       
        //aynı keye farklı bir eleman eklersek eskii value silinie,eski keyde yeni value olur
       hashMap.put(25, "go");
       System.out.println(hashMap);
        
        //aynı keye aynı value  eklersek eskieski valu silinip yeni value eklenir 
         //ama valueler aynı olduğundan birşey değişmemiş gibi olur
       hashMap.put(25, "go");
       System.out.println(hashMap);
       
       // bir key deki elemanı şöyle öğrenebiliriz
        System.out.println(hashMap.get(10));
        // istediğimiz key boş ise null döner
        System.out.println(hashMap.get(100));
     
       // fakat System.out.println(hashMap.get("java")); bu şekilde value üzerinden keye  ulaşamıyoruz null döner
       
       
       
       
       // şu şekilde  for each in farklı bir versiyonu ile hem key hem value ye ayrı ayrı ulaşabiliriz.
           for (Map.Entry<Integer, String> entry1 : hashMap.entrySet()) {
            Integer key = entry1.getKey();
            String value = entry1.getValue();
               System.out.println("anahtar : "+key+"  value : "+value);
            
        }
        
        
        
        
        
    }
    
}
