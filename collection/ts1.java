/*
 TreeSet--->SortedSet----Set
 Data uniquness + Sorting
 Sorting :-
   a. Default Natural Sorting [Comparable]
   b. Customized Sorint [Comparator]
  
   TreeSet()
   TreeSet(SortedSet)
   TreeSet(Collection)
   TreeSet(Comparator)
*/
import java.util.TreeSet;
class TestMain {
    public static void main(String ars[]){
      TreeSet<Integer> ts = new TreeSet<Integer>();
      ts.add(50);
      ts.add(10);
      ts.add(40);
      ts.add(30);
      ts.add(20);
      ts.add(40);
      ts.add(50);
      System.out.println(ts);
    }
}
