/*
   HashSet()  ----------------> ic:16, load-factor : 0.75
   HashSet(Collection)-------->
   HashSet(int)
   HashSet(int,float) -------->int:ic, float:LF [0 to 1] 
 
   What is Load Factor:-
    ArrayList al = new ArrayList(100);
    ---
    ---
    when java will create array list
    
    HashSet hs = new HashSet(100); ===> LF = 0.75 , 75% of 1
 */
import java.util.LinkedHashSet;
class TestHashSet {
  public static void main(String args[]){
     LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
     hs.add(10);
     hs.add(30);
     hs.add(10);
     hs.add(20);
     hs.add(90);
     hs.add(40);
     System.out.println(hs);
  }    
}
