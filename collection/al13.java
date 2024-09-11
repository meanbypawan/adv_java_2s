import java.util.ArrayList;
/*
    Car [id,modelNumber,MYear,brand]
         dependency
         dependency Injection
           consturctor 
           setter 
 */
import java.util.Iterator;
import java.util.Collections;
class Car{
    private int id;
    private int modelNumber;
    private String brand;

    public Car(int id, int modelNumber, String brand){
     this.id = id;
     this.modelNumber = modelNumber;
     this.brand = brand;       
    }

    public String toString(){
        return id+"  "+modelNumber+"  "+brand;
    }   
}
class TestMain{
    public static void main(String args[]){
      ArrayList<Car> al = new ArrayList<Car>();
      al.add(new Car(1,100234,"Volvo"));
      al.add(new Car(2,100254,"Hyundai"));
      al.add(new Car(4,100365,"Mahindra"));
      al.add(new Car(3,100761,"Tata"));
      
      //Collections.sort(al);

      Iterator<Car> itr =  al.iterator();       
      while(itr.hasNext()){
         Car car = itr.next();
         System.out.println(car);
      }
    }
}