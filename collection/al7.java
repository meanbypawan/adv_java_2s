/*
  Iterator
 */
import java.util.ArrayList;
import java.util.Iterator;
class TestMain{
   public static void main(String args[]){
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(10);
    al.add(20);
    al.add(50);
    al.add(40);
    al.add(30);
    Iterator<Integer> itr = al.iterator(); 
    while(itr.hasNext()){
       Integer element = itr.next();
       System.out.println(element);      
    }
   }
}