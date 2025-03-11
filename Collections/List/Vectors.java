package Collections.List;
import java.util.LinkedList;
import java.util.Vector;



public class Vectors {
    
public static void main(String[] args) {
    

Vector<Integer> vector = new Vector<>();

vector.add(34);
vector.add(2);
vector.add(67);
vector.add(89);


LinkedList<Integer>linkedlist = new LinkedList<>();


linkedlist.add(43);
linkedlist.add(65);

Vector<Integer> newvector = new Vector<>(linkedlist);


// remove all elements 
newvector.clear();

System.out.println(newvector);



// System.out.println(vector.capacity());




}

}

