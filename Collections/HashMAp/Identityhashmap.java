package Collections.HashMAp;
import java.util.IdentityHashMap;
import java.util.Map;


// IdentityHashMap is a special kind of Map in Java (just like HashMap), but with one major difference:
// 👉 It uses == (reference equality) instead of .equals() method to compare keys.


// 🔍 Wait, what does that mean?
// Normally in a HashMap, when you add a key, Java checks:

// key1.equals(key2)
// to see if two keys are the same.

// But in IdentityHashMap, Java checks:


// key1 == key2
// — it compares if both keys are the same object in memory, not if their contents are equal.




// In a normal HashMap, key1.equals(key2) would be true, so the second value would overwrite the first one. But in IdentityHashMap, since key1 != key2 (they are two separate objects), both entries stay.



// ✅ When to use IdentityHashMap?
// When object identity (memory reference) is more important than content.
// Used in frameworks, internals, caches, or object tracking systems.
// Rare in day-to-day use, but powerful in the right situations.




// ⚠️ Things to remember:
// It's faster in some specific scenarios.
// Not thread-safe.
// Keys must not be replaced with equal objects unless they are the same reference.







public class Identityhashmap {
    
    public static void main(String[] args) {
        
  Map<String, String> map = new IdentityHashMap<>();

        String key1 = new String("apple");
        String key2 = new String("apple");

        map.put(key1, "fruit1");
        map.put(key2, "fruit2");

        System.out.println(map.size());  // Output: 2
        System.out.println(map);   



    }

}
