package DZ3.DZ3_1;

import java.util.HashMap;
import java.util.Map;

public class CountMapImpl<T> implements CountMap<T> {

    private final HashMap<T, Integer> map = new HashMap<>();

    @Override
    public void add(T o) {
        map.put(o, map.getOrDefault(o, 0) + 1);
    }

    @Override
    public int getCount(T o) {
        return map.getOrDefault(o, 0);
    }

    @Override
    public int remove(T o) {
        Integer value = map.remove(o);
        if (value == null) return -1;
        else return value;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap<T> source) {
        Map<T, Integer> sourceMap = source.toMap();
        for (var key : sourceMap.keySet()) {
            int thisCount = map.getOrDefault(key, 0);
            int sourceCount = sourceMap.get(key);
            map.put(key, thisCount + sourceCount);
        }
    }

    @Override
    public Map<T, Integer> toMap() {
        return map;
    }

    @Override
    public void toMap(Map<T, Integer> destination) {
        for (var key : this.toMap().keySet()) {
            int thisCount = destination.getOrDefault(key, 0);
            int sourceCount = map.get(key);
            destination.put(key, thisCount + sourceCount);
        }
    }
}
