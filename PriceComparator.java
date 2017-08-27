package sort;



import java.util.Comparator;

 public class PriceComparator implements Comparator {



     public int compare(Object obj1, Object obj2) {
         Book b1=  (Book) obj1;
         Book b2 =  (Book) obj2;
         return new Double(b1.price).compareTo(new Double(b2.price));
     }


 }
