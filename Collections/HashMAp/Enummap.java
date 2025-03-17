package Collections.HashMAp;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;



// EnumMap is a specialized Map implementation specifically designed to work with Java enum types.
// It belongs to java.util package.
// It is faster than other Map implementations like HashMap when keys are enum constants.




// 🎯 Why Use EnumMap Instead of Other Maps?
// ✅ Performance Boost
// EnumMap is faster and more efficient than HashMap when the keys are enums.
// Internally it uses an array, not hashing, which makes access and updates very quick.
// 💡 Type Safety
// Since it only accepts enum types as keys, it avoids accidental key errors.
// The compiler enforces that only enum constants are used as keys.
// 🧠 Natural Order of Enum Constants
// EnumMap keeps keys in the same order as they are declared in the enum.
// This makes iteration predictable and often useful for display or processing logic.
// 📉 Less Memory Usage
// Uses less memory compared to a HashMap with the same enum keys, because it stores values in a compact array structure.
// 🧹 Cleaner Code
// EnumMap makes code more readable and expressive when enums are logically linked to values (e.g., days of week → tasks, states → messages).







enum Day{

    Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday 
}




public class Enummap {
    
    public static void main(String[] args) {
    
        

     Map<Day,String>map = new EnumMap<>(Day.class);

     map.put(Day.Saturday,"Gym");
     map.put(Day.Tuesday,"Walk");
     System.out.println(map);

  
     // Ordinal() --> it will return index
     System.out.println(Day.Sunday.ordinal());





    }

}
