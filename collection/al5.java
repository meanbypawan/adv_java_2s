import java.util.ArrayList;
/*
  add(E)
  add(int index, E)
  IndexOutOfBoundsException (Collection)
    |---ArrayIndexOutOfBoundsException (Array)
    |---StringIndexOutOfBoundsException (String)
 */
class TestMain{
    public static void main(String... args){
     ArrayList<Integer> al = new ArrayList<Integer>();
     al.add(5);
     al.add(6);
     al.add(7);
     al.add(1);
     al.add(2);
     
     for(int i=0; i<al.size(); i++){
        Integer element = al.get(i);
        System.out.println(element);
     }
   }
}
