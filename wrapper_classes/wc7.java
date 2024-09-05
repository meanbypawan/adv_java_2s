// String is child of Object
// Object is parent of all things
//
class A{}
class B extends A{}
class TestMain{
    public static void main(String args[]){
        String s1 = "hello";
        Object o1 = s1; // parent is holding child : upcasting
        String s2 = (String)o1; // downcasting
        System.out.println(s2);

        Object o2 = "ABC";
        String s3 = (String)o2;
        System.out.println(s3);
        
        A obj = new B(); // upcasting

        B obj2 = (B)obj; // downcasting

       A aObj = new A();
       B bobj = (B)aObj;

    }
}