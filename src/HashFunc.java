import java.util.HashMap;
import java.util.Map;

public class HashFunc {

    public static HashMap<Character, Boolean> hashCreate(String sourceString) {

        HashMap<Character, Boolean> cache = new HashMap<Character, Boolean>();

        cache.put(sourceString.charAt(0), true);
        for (int i = 0; i < sourceString.length(); i++) {
            // System.out.println(sourceString.charAt(i));
            cache.put(sourceString.charAt(i), true);
        }

        return cache;
    }

    public static void hashDisplay(HashMap<Character, Boolean> cache) {
        for (Map.Entry<Character, Boolean> entry : cache.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    public static boolean hashSearch(HashMap<Character, Boolean> cache, String searchString) {

        for (int i = 0; i < searchString.length(); i++) {
            try {
                if (cache.get(searchString.charAt(i)))
                    continue;
            } catch (Exception e) {
                // catch the null. this means non match.
                return false;
            }

        }

        // Table.hashDisplay(cache);
        return true; // always return true meaning entire match found at this point otherwise null
                     // exception above would return false for non matching situation.
    }

}
