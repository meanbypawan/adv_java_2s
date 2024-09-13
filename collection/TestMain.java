import java.util.HashMap;
public class TestMain{
    public static void main(String args[]){
        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        hm.put(1001, "A");
        hm.put(1002,"B");
        hm.put(5000,"E");
        hm.put(4000,"C");

        System.out.println(hm);
    }
}
