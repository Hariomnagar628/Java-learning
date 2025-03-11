package Collections.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.List;

public class CopyOnWriteArraylistdemo {

    public static void main(String[] args) {
        
        CopyOnWriteArrayList<Integer> list =  new CopyOnWriteArrayList<>();

        // "Copy on write" means that whenever a write operation 
        // like adding or removing elements
        // instead of directly modifying the existing list
        // a new copy of the list is created, and the modification is applied to that copy 
        // this ensures that other threads reading the list while it's being modified are unaffected.
         
        // Read operation: Fast and direct,since they happen on a stable list without interference from modification.
        // Write operation: A new copy of the list is created for every modification.



//         ArrayList<String> Shoppinglist = new ArrayList<>();

//         Shoppinglist.add("Milk");
//         Shoppinglist.add("Eggs");
//         Shoppinglist.add("Bread");
        
//         System.out.println("Initial Shoppign list: " + Shoppinglist);

//         for(String item:Shoppinglist)
//         {
//             System.out.println(item);

//             if(item.equals("Eggs"))
//             {
//                 Shoppinglist.add("Butter");
//                 System.out.println("Added Butter while reading");
//             }

//         }

// System.out.println("Updated Shopping list:"+Shoppinglist);




  List<String> Shoppinglist = new CopyOnWriteArrayList<>();

Shoppinglist.add("Milk");
Shoppinglist.add("Eggs");
Shoppinglist.add("Bread");

System.out.println("Initial Shoppign list: " + Shoppinglist);

for(String item:Shoppinglist)
{
    System.out.println(item);

    if(item.equals("Eggs"))
    {
        Shoppinglist.add("Butter");
        System.out.println("Added Butter while reading");
    }

}

System.out.println("Updated Shopping list:"+Shoppinglist);








    }
}

