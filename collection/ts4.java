/*
 List :-- []
 Set
 Map :- {}

 Category
   Electronic
    |-Mobile
    |-Laptop
   Cosmatics
    |--Lipstic
    |- Mackup kit
   Garments
    |--Men Jeans
    |--T-shirts
    |--Shirts  
 
 */
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Map;

class TestMain {
    public static void main(String args[]){
        TreeMap<String,ArrayList<String>> tm = new TreeMap<String,ArrayList<String>>();
       
        ArrayList<String> elecProduct = new ArrayList<String>();
        elecProduct.add("Mobile");
        elecProduct.add("Laptop");
        tm.put("Electronic",elecProduct);

        ArrayList<String> cosmProduct = new ArrayList<String>();
        cosmProduct.add("Lipstick...");
        cosmProduct.add("Perfume");
        tm.put("Cosmatic",cosmProduct);

        for(Map.Entry<String,ArrayList<String>>entry : tm.entrySet()){
             String categoryName = entry.getKey();
             ArrayList<String> productList = entry.getValue();
             System.out.println(categoryName+"\n--------------------");
             for(String p : productList)
               System.out.println(p);
        }
    }
}
