/*
  a. With Type safety [Type Safe]
     Generic class
  b. Withoud type safety

 */
import java.util.ArrayList;
class TestMain{
    public static void main(String args[]){
      //ArrayList<Integer> al = new ArrayList<Integer>();
      ArrayList<Object> al = new ArrayList<Object>();
      al.add(100);
      al.add(200);
      al.add(100);
      al.add("hello");
      al.add("A");
      al.add(true);
      System.out.println(al);
    }
}