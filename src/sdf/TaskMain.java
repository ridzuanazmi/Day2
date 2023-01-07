package sdf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TaskMain {
    
    public static void main(String[] args) {
        
        List<Car> garage = new LinkedList<Car>();
        Set<String> addressbook = new HashSet<>();
        Map<String, Integer> debts = new HashMap<>();

        // Add cars to garage
        garage.add(new Car());
        garage.add(new Porche());

        // Add names to addressbook
        addressbook.add("Fred");
        addressbook.add("Barney");
        addressbook.add("Wilma");
        addressbook.add("Fred");
        System.out.println(addressbook);

        // Add my debtors
        debts.put("Fred", 10);
        debts.put("Barney", 10);
        debts.put("Fred", 100);
        System.out.println(debts);

    }
}
