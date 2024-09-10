/*
  Iterator v/s ListIterator

  Iterator :-
  1. Iterator itr = c1.iterator();
  2. iterator() method is available in Iterable interface so it applicable on all child classes of collection hierarchy.
  3. Iterator can only move in forward direction.
  4. Iterator by default start with the first position you can not 
     change the cursor position.
  ListIterator
  1:- ListIterator lit = l1.listIterator();
      ListIterator lit = l1.listIterator(4);
  2:- listIterator() method is available in List collection so it is applicable on all child classes of List Only [AL, LL, Vec, Stack]
  3. :- ListIterator can move in forward as well as backward both    
  4. You can change the cursor position.
  5. ListIterator is child of Iterator
  interface Iterator{} ----> Forward Traversin
  interface ListIterator extends Iterator{} ---> Forward + Backward
 */
import java.util.ArrayList;
import java.util.Iterator;
class TestMain{
   public static void main(String args[]){
    ArrayList<Integer> al = new ArrayList<Integer>();
   }
}