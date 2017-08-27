package sort;

import com.sun.tools.javac.util.*;

import java.util.*;
import java.util.List;

public class Comparator {

    public static void main(String[] args) {

        Book b1 = new Book(1, "computer book", "Sherry", 23.00, new GregorianCalendar(2001, 03, 04));
        Book b2 = new Book(3, "animal book", "Ashily", 103.00, new GregorianCalendar(1990, 01, 11));
        Book b3 = new Book(12, "vege book", "Fion", 55.00, new GregorianCalendar(1984, 3, 01));
        Book b4 = new Book(34, "DIY book", "Fargo", 99.00, new GregorianCalendar(2007, 03, 04));
        Book b5 = new Book(104, "cooking book", "Lucy", 13.00, new GregorianCalendar(2013, 8, 22));

        List<Book> list = new ArrayList<Book>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);

        //Sorting according to book price

        Collections.sort(list, new PriceComparator());
        System.out.println("Sorting according to Price");
        printList(list);

        System.out.println("-------------------------");

        //Sorting according to released time

        Collections.sort(list, new TimeComparator());
        System.out.println("Sorting by released year");
        printList(list);


    }

    public static void printList(List<Book> list) {
        Iterator iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println("\t" + iterator.next());

        }
    }
}
