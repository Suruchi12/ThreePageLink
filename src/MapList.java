
import java.util.*;

public class MapList {

    private Map<String, List<String>> map;

    MapList() {
        map = new HashMap<>();
    }

    public List<String> put(String key, String value) {
        List<String> values;

        if (map.get(key) == null)
            values = new ArrayList<>();
        else
            values = map.get(key);

        values.add(value);
        return map.put(key, values);

    }

    public Set<String> keySet() {
        return map.keySet();
    }

    public List<String> get(Object key) {
        return map.get(key);
    }

    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

}
