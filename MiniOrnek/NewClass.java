
package CollectionMap.MiniOrnek;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class NewClass {
    public static void main(String[] args) {
        
      Scanner scanner=new Scanner(System.in);  
      System.out.println("Lütfeb Cümleyi Giriniz");
      String cumle=scanner.nextLine();
      
      Map<Character,Integer> frekans=new TreeMap<Character, Integer>();
      
      
        for (int i = 0; i < cumle.length(); i++) {
            char c=cumle.charAt(i);
            if (frekans.containsKey(c)) {
                frekans.replace(c, frekans.get(c)+1);
                
            }
            else{frekans.put(c, 1);}
            
        }
      
        
        for (Map.Entry<Character, Integer> entry : frekans.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"  harfi "+value+" kadar bulunmaktadır");
            
        }
        
        
        
    }
    
   
    
    
}
