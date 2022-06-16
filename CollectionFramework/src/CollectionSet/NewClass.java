
package CollectionSet;

import java.awt.AWTEventMulticaster;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class NewClass {
    public static void main(String[] args) {
        
       // HashSet oluşturma
        HashSet<String> set1=new HashSet<>();
       // Set<String> set=new HashSet<>(); //bu şekide de oluşturabilirdik
       set1.add("java");
       set1.add("php");
       set1.add("javascript");
       set1.add("python");
       set1.add("kotlin");
       
       
       System.out.println("HashSet***************");
       //sıralı olarak vermez
       for(String s: set1){System.out.println(s);}
       
       
       //LinkedHashSet oluşturma
       LinkedHashSet<String> set2=new LinkedHashSet<>();
       // Set<String> set=new LinkedHashSet<>(); //bu şekide de oluşturabilirdik 
       set2.add("java");
       set2.add("php");
       set2.add("javascript");
       set2.add("python");
       set2.add("kotlin");
      
       System.out.println("LinkedHashSet**************");
       //sıralı olarak verir
       for(String s: set2){System.out.println(s);}
       
       
       //TreeSet oluşturma
        TreeSet<String> set3=new TreeSet<>();
       // Set<String> set=new TreeSet<>(); //bu şekide de oluşturabilirdik  
       set3.add("java");
       set3.add("php");
       set3.add("javascript");
       set3.add("python");
       set3.add("kotlin");
       
       System.out.println("TreeSet 1*********************");
       //Stringleri alfabetik sıraya göre verir
       for(String s: set3){System.out.println(s);}
       
       //TreeSet oluşturma
        TreeSet<Integer> set4=new TreeSet<>();
       // Set<String> set=new TreeSet<>(); //bu şekide de oluşturabilirdik  
       set4.add(9);
       set4.add(5);
       set4.add(12);
       set4.add(1);
       set4.add(7);
       
       System.out.println("TreeSet 2*********************");
       //sayıları küçükten büyüğe doğru sıralar
       for(Integer s: set4){System.out.println(s);}
       
       
       // setin bir elemanı içerip içermediğini bildiren method varsa true yoksa false döndürü
        System.out.println(set4.contains(5)); 
        System.out.println(set4.contains(11));  
        System.out.println(set1.contains("go")); 
        
        //boş mu methodu boş ise true dolu ise false döndürür
        System.out.println(set2.isEmpty());
        
        //istenilen elemanı silme
        System.out.println("SET2 ikinci durum**********");
        set2.remove("python");
        for(String s: set2){System.out.println(s);}
        
        System.out.println("SET2 üçüncü durum**********");
        set2.add("java");// java zaten olduğu için tekrar eklemeyecektir 
        for(String s: set2){System.out.println(s);}
        
        
        //Kesişim ve fark kümesi bulma
        
         HashSet<String> set5=new HashSet<>();
         
        set5.add("java");
        set5.add("php");
        set5.add("javascript");
        set5.add("python");
        set5.add("kotlin");
        
        HashSet<String> set6=new HashSet<>();
        
        set6.add("javascript");
        set6.add("python");
        set6.add("kotlin");
        set6.add("css");
        set6.add("go");
        
        
        // set5 ile set6 nın farkı şöyle bulunur
 
        System.out.println("fark listesi");
        HashSet<String> fark=new HashSet<>(set5);// farkı önce set 5e eşitledik
        System.out.println(fark.removeAll(set6));//eğer fark varsa true döner
        System.out.println(fark);// böyle farkı yazdırıyoruz
        
        // set5 ile set6 nın kesişimi şöyle bulunur
        System.out.println("kesişim kümesi");
        HashSet<String>kesisim=new HashSet<>(set5);//kesişimi set5 ile eşleştirdik
        System.out.println(kesisim.retainAll(set6));//kesişimi dolu iste true boş ise false döner
         System.out.println(kesisim);// böyle kesişimiyazdırıyoruz       
        
        /*not bu arada bir setin içini şöyle yazdırabiliriz
         System.out.println(set ismi);
         */
    }
    
}
