import java.util.ArrayList;
import java.util.Iterator;
public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
  ArrayList<Integer> a=new ArrayList<>();
  a.add(2);
  a.add(3);
  a.add(4);
   Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
           
            System.out.println(iterator.next());
        }
}
}
