
package CollectionMap.Hashcode_Equals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class NewClass {
    /* kendi oluşturduğumus claslardan oluşturduğumuz nesneleri
    maplara yada setlere ekleyebiliriz ama bu claslardan ürettiğimiz nesneler 
    aynı olsa bile map ve setler bunu algılamaz algılayıp aynıları eklememesi için
     clasımıza hascode ve equals methodlarını override etmemiz gerekir
    */
    public static void main(String[] args) {
        
        Set<String> hashSet=new HashSet<>();
        
        hashSet.add("java");
        hashSet.add("python");
        hashSet.add("C#");
        // aynı elemanı eklemez 
        
        hashSet.add("C#");
        System.out.println(hashSet);
         
        System.out.println("*********************");
      // hashcode ve equals metodu içermeyen player clasından nesne seti oluşturlım  
        
        
        Set<Player> hashSet1=new HashSet<>();
        
         Player player1=new Player("mehmet", 10);
         Player player2=new Player("ahmet", 15);
         Player player3=new Player("rojhat", 20);
         Player player4=new Player("mehmet", 10);// player 1 ile aynı değerler
         
         hashSet1.add(player1);
         hashSet1.add(player2);
         hashSet1.add(player3);
         hashSet1.add(player4);

         System.out.println(hashSet1);
         /* burada aynı ad ve id ileik eleman ekledibunu engellemek için oluşturacağımız 
         class ta hashcode ve equals methodlarını override etmelityiz*/
         
         System.out.println("*********************");
         Set<PlayerNew> hashSetNew=new HashSet<>();
        
         PlayerNew playerNew1=new PlayerNew("mehmet", 10);
         PlayerNew playerNew2=new PlayerNew("ahmet", 15);
         PlayerNew playerNew3=new PlayerNew("rojhat", 20);
         PlayerNew playerNew4=new PlayerNew("mehmet", 10);// player 1 ile aynı değerler
         
         hashSetNew.add(playerNew1);
         hashSetNew.add(playerNew2);
         hashSetNew.add(playerNew3);
         hashSetNew.add(playerNew4);

         System.out.println(hashSetNew);// burada aynı elemanlar bir kez yazılacaktır
    }
    
}




class Player {
private String name;
private int id;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
       return "     Name : "+name+" Id : "+id;
    }
}





class PlayerNew {// yeni classta hashcode ve equals ı override ettik
private String name;
private int id;

    public PlayerNew(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
       return "     Name : "+name+" Id : "+id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PlayerNew other = (PlayerNew) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
}