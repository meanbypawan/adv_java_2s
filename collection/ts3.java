import java.util.*;
class TestMain {
  public static void main(String args[]){
     HashSet<String> hs = new HashSet<String>();
     LinkedHashSet<String>lhs = new LinkedHashSet<String>();
     TreeSet<String> ts = new TreeSet<String>();

     System.out.println("HashSet.........");
     hs.add(null);
     hs.add(null);
     System.out.println(hs);

     System.out.println("LinkedHashSet.......");
     lhs.add(null);
     lhs.add(null);
     System.out.println(lhs);
     System.out.println("TreeSet....");
     //ts.add(null);  // null entry not allowed in treeset
  }    
}
