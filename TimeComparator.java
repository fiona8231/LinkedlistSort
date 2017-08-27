package sort;


import java.util.Comparator;

public class TimeComparator  implements Comparator {

    public int compare(Object obj1, Object obj2) {

        Book b1 = (Book) obj1;
        Book b2 = (Book) obj2;

        return  b2.calendar.compareTo(b1.calendar);

    }
}
