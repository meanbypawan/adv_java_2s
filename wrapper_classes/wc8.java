import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("please let me know your contact number");
      String contact = sc.next();
      try{
        Long.parseLong(contact);
        if(contact.length()!=10)
          System.out.println("Invalid contact number");
        else
          System.out.println("Thank you...");  
      }
      catch(Exception e){
        System.out.println("Only digits are allowed..");
      }
    }
}