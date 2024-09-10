/*
  //public E remove(int);  2 : int
  public boolean remove(java.lang.Object); 2 : Object
  
  // Searching operation
  // When element is found then break
  al.remove(2);

  Overloading / Compile Time / Early

  al.remove(2) :- HMP :- 1
                  Type :- int
   
    
 */
import java.util.ArrayList;
class TestMain{
    public static void main(String args[]){
       ArrayList<Integer> al = new ArrayList<Integer>();

       al.add(10);
       al.add(1);
       al.add(7);
       al.add(8);
       al.add(2);
       al.add(6);
       al.add(7);
       al.add(2);
       System.out.println("Before Remove : "+al);
       //al.remove(2);
       for(int i=0; i<al.size(); i++){
          Integer element = al.get(i);
          if(element == 2)
            al.remove(element);
       }
       System.out.println("After Remove : "+al);      
    }
}