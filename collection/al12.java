import java.util.ArrayList;
import java.util.Collections;
class TestMain{
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(30);
        al.add(50);
        al.add(10);
        al.add(40);
        al.add(20);
        al.add(40);
        Collections.sort(al);
        System.out.println(al);
    }
}