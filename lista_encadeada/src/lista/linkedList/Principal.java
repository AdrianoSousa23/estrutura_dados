package lista.linkedList;
import java.util.Iterator;
import java.util.LinkedList;
public class Principal {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(2);
        ll.add("adriano");
        ll.add(5);
        System.out.println("elementos: " + ll.size());
        ll.toString();
        ll.getFirst();
        ll.getLast();
        ll.get(2);
        ll.remove(1);
        ll.remove("adriano");

    }


}
