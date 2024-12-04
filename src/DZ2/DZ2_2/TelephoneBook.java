package DZ2.DZ2_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class TelephoneBook {
    private HashMap<String, ArrayList<String>> records = new HashMap<>();

    // добавление одного телефона
    public void add(String name, String phone) {
        var record = records.get(name);
        if (record != null && !record.contains(phone)) {
            record.add(phone);
        } else {
            ArrayList<String> newPhoneArray = new ArrayList<>();
            newPhoneArray.add(phone);
            records.put(name, newPhoneArray);
        }
    }

    // добавление коллекции телефонов
    public void add(String name, Collection<String> phones) {
        var record = records.get(name);
        if (record != null) {
            HashSet<String> uniqueNumbers = new HashSet<>(record);
            uniqueNumbers.addAll(phones);
            record.clear();
            record.addAll(uniqueNumbers);
        } else {
            ArrayList<String> newPhoneArray = new ArrayList<>(phones);
            records.put(name, newPhoneArray);
        }
    }

    public ArrayList<String> get(String name) {
        var record = records.get(name);
        if (record == null)
            return new ArrayList<>();
        else
            return record;
    }

}
