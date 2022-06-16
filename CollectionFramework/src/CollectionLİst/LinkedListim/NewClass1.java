
package CollectionLİst.LinkedListim;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class NewClass1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        ArrayList<Integer> arraydList=new ArrayList<>();
        
        zamanHesapla("LinkedList", linkedList);
        
        zamanHesapla("ArrayList", arraydList);
        
        
    }
    public static void zamanHesapla(String ver_tipi,List<Integer>list){
        //sona eleman ekleme ArrayListler daha performanslıdır.
        
        // giriş ve çıkış zamanını hesaplamak için
         
       double giriszamani;
       double cikiszamani;

         giriszamani=System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++) {
            list.add(i);// sona ekleme
            
        }
         cikiszamani=System.currentTimeMillis();
    
        double gecenzaman=cikiszamani-giriszamani;
  
        System.out.println("sona eklemede "+ver_tipi+" için geçen süre : "+gecenzaman);
          giriszamani=System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);// başa yada ortaya ekleme ekleme
            
        }
         cikiszamani=System.currentTimeMillis();
    
        gecenzaman=cikiszamani-giriszamani;
  
    
        System.out.println("başa yada araya eklemede "+ver_tipi+" için geçen süre : "+gecenzaman);
    
    }
    
}
