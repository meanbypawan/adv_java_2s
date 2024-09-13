/*
  public class HashSet<T>{
    private HashMap<T> map;
    private static final Object PRESENT = null; 
    public HashSet(){
       map = new HashMap<T>();
    }
    public boolean add(T elem){
       map.put(elem,PRESENT);
    }   
  }
 */
import java.util.HashSet;
class TestMain{
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(100);
    }
}