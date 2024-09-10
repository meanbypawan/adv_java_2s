import java.util.ArrayList;
class TestMain{
    public static void main(String args[]){
        // 
        ArrayList<String> al = new ArrayList<String>();
        // String al[] = new String[3];
        al.add("A");
        al.add("B");
        al.add("C");
        
        System.out.println("Total element : "+al.size());
        System.out.println(al);
        
        al.add("D"); // 50% =(cc*3)/2 + 1  new Al Will be Create here
        al.add("E");
        System.out.println("Total element : "+al.size());
        System.out.println(al);
        
        al.add("F"); // one another will be created here (cc*3)/2+1 ==> 8 
    }
}