package DZ2.DZ2_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();

        telephoneBook.add("John", "12345");
        telephoneBook.add("John", List.of("567", "293"));
        telephoneBook.add("John", List.of("567", "293"));

        var record = telephoneBook.get("John");
        System.out.printf("John: %s\n", record);

        telephoneBook.add("Lisa", "57829");
        record = telephoneBook.get("Lisa");
        System.out.printf("Lisa: %s\n", record);

        record = telephoneBook.get("Smith");
        System.out.printf("Smith: %s\n", record);
    }
}
