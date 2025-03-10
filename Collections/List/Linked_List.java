package Collections.List;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
    
    public static void main(String[] args) {
        
        LinkedList<Integer>linkedlist = new LinkedList<>();

        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);

        linkedlist.get(0);//O(n)

        linkedlist.addLast(5);// O(1)
        linkedlist.addFirst(7);// O(1)


        linkedlist.getFirst();
        linkedlist.getLast();   

        // linkedlist.removeIf(x->x%2==0);




        // it will remove all duplicates 
        LinkedList<Integer> number1 = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        
        LinkedList<Integer> number2 = new LinkedList<>(Arrays.asList(2,3,4));

        number1.removeAll(number2);
        System.out.println(number1);

      

    }


}
