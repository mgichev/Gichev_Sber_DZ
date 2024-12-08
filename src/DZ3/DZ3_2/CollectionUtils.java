package DZ3.DZ3_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionUtils {
    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List<T> newArrayList() {
        return new ArrayList<T>();
    }

    public static <T> int indexOf(List<? extends T> source, T o) {
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) == o) {
                return i;
            }
        }
        return -1;
    }

    public static <T> List<T> limit(List<? extends T> source, int size) {
        List<T> list = newArrayList();
        for (int i = 0; i <= Math.min(size, source.size() - 1); i++) {
            list.add(source.get(i));
        }
        return list;
    }

    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static <T> boolean containsAll(List<? extends T> c1, List<? extends T> c2) {
        for (var el : c1) {
            if (!c2.contains(el)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean containsAny(List<? extends T> c1, List<? extends T> c2) {
        for (var i : c1) {
            for (var j : c2) {
                if (i.equals(j))
                    return true;
            }
        }
        return false;
    }

    public static <T extends Comparable<T>> List<T> range(List<? extends T> list, T min, T max) {
        List<T> arr = newArrayList();
        for (var it : list) {
            if (it.compareTo(min) >= 0 && it.compareTo(max) <= 0) {
                arr.add(it);
            }
        }
        return arr;
    }

    public static <T> List<T> range(List<? extends T> list, T min, T max, Comparator<T> comparator) {
        List<T> arr = newArrayList();
        for (var it : list) {
            if (comparator.compare(it, min) >= 0 && comparator.compare(it, max) <= 0) {
                arr.add(it);
            }
        }
        return arr;
    }

}