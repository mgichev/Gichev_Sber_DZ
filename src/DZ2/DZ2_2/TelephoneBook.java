package DZ2.DZ2_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class TelephoneBook {
    private HashMap<String, ArrayList<String>> records = new HashMap<>();

    public void add(String name, String phone) {
        var record = records.get(name);
        if (record != null) {
            record.add(phone);
        } else {
            ArrayList<String> newPhoneArray = new ArrayList<>();
            newPhoneArray.add(phone);
            records.put(name, newPhoneArray);
        }
    }

    public void add(String name, Collection<String> phones) {
        var record = records.get(name);
        if (record != null) {
            record.addAll(phones);
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
