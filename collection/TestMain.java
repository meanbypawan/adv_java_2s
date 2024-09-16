/*
 interface Map{
    interface Entry{
    }
 }
 */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeMap;
public class TestMain{
    public static void main(String args[]){
        //HashMap<Integer,String> hm = new HashMap<Integer,String>();
        //LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
        TreeMap<Integer,String> hm = new TreeMap<Integer,String>();
        hm.put(1001,"D");
        hm.put(1002,"D");
        hm.put(5000,"D");
        hm.put(4000,"D");
        hm.put(4000,"D"); // 4000 --> c | 4000--->D
             
        for(Map.Entry<Integer,String> e : hm.entrySet())
          System.out.println(e.getKey()+"  "+e.getValue());
        // Set<Map.Entry<Integer,String>> s = hm.entrySet();
        // Iterator<Map.Entry<Integer,String>> itr =  s.iterator();
        // while(itr.hasNext()){
        //   Map.Entry<Integer,String> entry =   itr.next();
        //   System.out.println(entry.getKey()+"  "+entry.getValue());
        // }
    }
}
