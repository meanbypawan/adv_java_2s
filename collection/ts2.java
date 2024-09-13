/*
    Car [id,modelNumber,MYear,brand]
         dependency
         dependency Injection
           consturctor 
           setter 
 */
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
class Car implements Comparable<Car>{
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
    public int getModelnumber(){
        return modelNumber;
    }
    public String getBrand(){
        return brand;
    }
    @Override
    public int compareTo(Car o1) {
        return this.id - o1.id;
    }
}
class SortByModelNumber implements Comparator<Car>{
   @Override
   public int compare(Car o1, Car o2) {
     return o1.getModelnumber() - o2.getModelnumber();  
   }
}
class SortByBrand implements Comparator<Car>{
    @Override
    public int compare(Car o1, Car o2) {
        int x =  o1.getBrand().compareTo(o2.getBrand());
        if(x == 0)
         return 1;
        return x; 
    }
}
class TestMain{
    public static void main(String args[]){
      TreeSet<Car> ts = new TreeSet<Car>();
      //TreeSet<Car> ts = new TreeSet<Car>(new SortByModelNumber());
      //TreeSet<Car> ts = new TreeSet<Car>(new SortByBrand());
      ts.add(new Car(1,100234,"Volvo"));
      ts.add(new Car(2,100154,"Hyundai"));
      ts.add(new Car(4,100365,"Mahindra"));
      ts.add(new Car(3,100761,"Tata"));
      ts.add(new Car(6,100611,"Tata"));
      ts.add(new Car(5,100123,"BMW"));
      
      //Collections.sort(al);

      Iterator<Car> itr =  ts.iterator();       
      while(itr.hasNext()){
         Car car = itr.next();
         System.out.println(car);
      }
    }
}