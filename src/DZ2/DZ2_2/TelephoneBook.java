package DZ2.DZ2_2;

import java.util.*;

public class TelephoneBook {
    private HashMap<String, HashSet<String>> records = new HashMap<>();

    // добавление одного телефона
    public void add(String name, String phone) {
        var record = records.get(name);
        if (record != null) {
            record.add(phone);
        } else {
            HashSet<String> newNameSet = new HashSet<>();
            newNameSet.add(phone);
            records.put(name, newNameSet);
        }
    }

    // добавление коллекции телефонов
    public void add(String name, Collection<String> phones) {
        var record = records.get(name);
        if (record != null) {
            record.addAll(phones);
        } else {
            HashSet<String> newNameSet = new HashSet<>(phones);
            records.put(name, newNameSet);
        }
    }

    public HashSet<String> get(String name) {
        var record = records.get(name);
        if (record == null)
            return new HashSet<>();
        else
            return record;
    }

}
