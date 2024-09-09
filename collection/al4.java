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

     al.add(3,2000); // index <= size()
     System.out.println(al);
     
    }
}
/*
  public void add(int index, Integer element){
     // index = 1000
     // element = 2000
     if(index > this.size())
       throw new IndexOutOfBoundsException();
     else{
       add element here
     }  
  }
 */
