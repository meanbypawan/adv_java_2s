/*
  a. With Type safety [Type Safe]
  b. Withoud type safety

 */
import java.util.ArrayList;
class TestMain{
    public static void main(String args[]){
      ArrayList al = new ArrayList();
      int x = 100;
      al.add(x);
      al.add(true);
      al.add("ABC");
      al.add(new Float(23.5f));
      System.out.println(al);
    }
}