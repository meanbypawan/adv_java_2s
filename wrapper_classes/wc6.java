/*
   Byte  -----> parseByte()
   Short -----> parseShort()
   Integer----.parseInt()
   Long  -----.parseLong()
   Float ----->parseFloat()
   Double------> parseDouble()
   
   static member of class
  2147483647 to -2147483648

  20
 */
class TestMain{
    public static void main(String args[]){
        String s1 = "20L";
        long x = Long.parseLong(s1);
        System.out.println(x);
        /*
        String s1 = "130";
        byte x = Byte.parseByte(s1); 
        System.out.println(x);
       */
    }
}