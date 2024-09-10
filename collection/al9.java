import java.util.ArrayList;
import java.util.ListIterator;
class TestMain{
   public static void main(String args[]){
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(10);
    al.add(20);
    al.add(50);
    al.add(40);
    al.add(30);
    ListIterator<Integer> lit = al.listIterator(al.size());
    while(lit.hasPrevious()){
        Integer element = lit.previous();
        System.out.println(element);
    } 
    // while(itr.hasNext()){
    //    Integer element = itr.next();
    //    System.out.println(element);      
    // }
   }
}