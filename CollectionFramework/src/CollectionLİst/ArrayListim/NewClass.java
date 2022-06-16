
package CollectionLİst.ArrayListim;

import java.util.LinkedList;
import java.util.List;

public class NewClass {
      public static void main(String[] args) {
       //bu şekilde linked list oluşturabildiğimiz gibi
        LinkedList<String> diller=new LinkedList<>();
        
       // bu şekilde de oluşturabiliriz çünkü List AbstractList'ten extends edilmiştir
        List<String> isimler=new LinkedList<>();
        
        
         diller.add("java");
         diller.add("python");
         diller.add("C#");
         
         isimler.add("ali");
         isimler.add("veli");
         isimler.add("rojo");
         
         //bu şekilde de okuyabiliriz
         for (int i = 0; i <diller.size(); i++) {
             System.out.println(diller.get(i));
      
        }
         
                System.out.println("**********");
             //bu şekilde for each il ede okuyabiliriz
             for(String oku : diller){
                 System.out.println(oku);
             }
            
          // ekleme metodu ile istediğimiz yere ekleme yapabiliriz       
            diller.add(3,"c++");
            diller.add(0,"perl");
            
            System.out.println("**********");
             //bu şekilde for each il ede okuyabiliriz
             for(String oku : diller){
                 System.out.println(oku);
                 
             }
             // bu şekilde idrek en sona eleman ekleyebiliriz
             diller.add("kotlin");
             
              System.out.println("**********");
             //bu şekilde for each il ede okuyabiliriz
             for(String oku : diller){
                 System.out.println(oku);
             }
             
             
            System.out.println("**********");
             //bu şekilde herhangi bir indexteki elemanı silebiliriz
             diller.remove(0);
             for(String oku : diller){
                 System.out.println(oku);
             }
            
               System.out.println("**********");
             // bu şekildelistenin boş olup olmadığını öğrenebilriz
            System.out.println(diller.isEmpty());
            if (diller.isEmpty()==false) {
                System.out.println("liste boş değilll");
            
             }
            else{System.out.println("liste boşşşşşş");}
 
            //bu şekilde bütün listenin içini silebiliriz.
            diller.clear();
                System.out.println("**********");
                for(String oku : diller){
                 System.out.println(oku);
             } 
                 System.out.println("**********");
             // bu şekildelistenin boş olup olmadığını öğrenebilriz
            System.out.println(diller.isEmpty());
            if (diller.isEmpty()==false) {
                System.out.println("liste boş değilll");
            
        }
            else{ System.out.println("liste boşş");}
            
            // şu şekilde yapsak yine elemanlarımızı alırız
            System.out.println(isimler);
    }
            
}
