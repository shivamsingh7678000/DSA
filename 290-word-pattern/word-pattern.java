import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Object, Integer> last = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!Objects.equals(last.put(pattern.charAt(i), i), last.put(words[i], i))) {
                return false;
            }
        }
        return true;
    }
}