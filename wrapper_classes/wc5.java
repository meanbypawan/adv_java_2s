// Primitive --> Object
// Object ---> Primitive
// Primitive ---> String
class TestMain{
    public static void main(String args[]){
        int x = 20;
        /*
        Integer iobj = x;
        String s  = iobj.toString();
        */
        //String s = Integer.toString(x);
        String s = ""+x;
        System.out.println(s);
    }
}