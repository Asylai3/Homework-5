package part2;
import java.util.*;
public class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> cache = new HashMap<>();
    public static MarkerStyle getStyle(String iconType, String color, String labelStyle) {
        String key = iconType + "_" + color + "_" + labelStyle;
        if (!cache.containsKey(key)) {
            cache.put(key, new MarkerStyle(iconType, color, labelStyle));
        }
        return cache.get(key);
    }
    public static int getUniqueStyleCount() {
        return cache.size();
    }
}
