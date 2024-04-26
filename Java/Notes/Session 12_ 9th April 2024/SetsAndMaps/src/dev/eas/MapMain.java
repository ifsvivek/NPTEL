package dev.eas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");

        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.forEach(System.out::println);
        System.out.println("-------------------------");

        Map<String, Contact> contacts = new HashMap<>();
        for(Contact contact : fullList) {
            contacts.put(contact.getName(), contact); // if duplicate key information is present,
        }                                               // put() will added last value related to key in the map
        contacts.forEach((k,v) -> System.out.println("key = "+ k + ", value = "+ v));

        System.out.println("----------------------------");
        System.out.println(contacts.get("Charlie Brown"));

        System.out.println(contacts.get("Chuck Brown"));

        Contact defaultContact = new Contact("Chuck Brown");
        System.out.println(contacts.getOrDefault("Chuck Brown", defaultContact)); // it is not added in the map

        System.out.println("----------------------------");
        contacts.clear();
        for(Contact contact : fullList) {
            Contact duplicate = contacts.put(contact.getName(), contact);
            if(duplicate != null) {
//                System.out.println("Duplicate = "+ duplicate);
//                System.out.println("Current = " + contact);
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }
        }
        contacts.forEach((k,v) -> System.out.println("key = "+ k + ", value = "+ v));

        System.out.println("----------------------------");
        contacts.clear();
        for(Contact contact : fullList) {
            contacts.putIfAbsent(contact.getName(), contact);
        }
        contacts.forEach((k,v) -> System.out.println("key = "+ k + ", value = "+ v));

        System.out.println("----------------------------");
        contacts.clear();
        for(Contact contact : fullList) {
            Contact duplicate = contacts.putIfAbsent(contact.getName(), contact);
            if(duplicate != null) {
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }
        }
        contacts.forEach((k,v) -> System.out.println("key = "+ k + ", value = "+ v));

        System.out.println("----------------------------");
        contacts.clear();
//        fullList.forEach(contact -> contacts.merge(contact.getName(), contact,
//                (previous, current) -> {
//                    System.out.println("prev: " + previous + " : current : " + current);
//                    Contact merged = previous.mergeContactData(current);
//                    System.out.println("merged" + merged);
//                    return merged;
//                }
//                ));
        fullList.forEach(contact -> contacts.merge(contact.getName(), contact,
                Contact::mergeContactData));
        contacts.forEach((k,v) -> System.out.println("key = "+ k + ", value = "+ v));

        System.out.println("----------------------------");
        for(String contactName : new String[]{"Daisy Duck", "Daffy Duck", "Scrooge Muck"}) {
//            contacts.compute(contactName, (k, v) -> new Contact(k));
            contacts.computeIfAbsent(contactName, k -> new Contact(k));
        }
        contacts.forEach((k,v) -> System.out.println("key = "+ k + ", value = "+ v));

        System.out.println("----------------------------");
        for(String contactName : new String[]{"Daisy Duck", "Daffy Duck", "Scrooge Muck"}) {
            contacts.computeIfPresent(contactName, (k, v) -> {
                v.addEmail("Fun Place");
                return v;
            });
        }
        contacts.forEach((k,v) -> System.out.println("key = "+ k + ", value = "+ v));

        System.out.println("----------------------------");
        contacts.replaceAll((k, v) -> {
            String newEmail = k.replaceAll(" ", "") + "@funplace.com";
            v.replaceEmailIfExists("DDuck@funplace.com", newEmail);
            return v;
        });
        contacts.forEach((k, v) -> System.out.println("key = "+ k + ", value = "+ v));

        System.out.println("----------------------------");
        Contact daisy = new Contact("Daisy Jane Duck", "daisyj@duck.com");

        Contact repalcedContact = contacts.replace("Daisy Duck", daisy);
        System.out.println("daisy = "+ daisy);
        System.out.println("replacedContact = " + repalcedContact);
        contacts.forEach((k, v) -> System.out.println("key = "+ k + ", value = "+ v));

        System.out.println("----------------------------");
        Contact updatedDaisy = repalcedContact.mergeContactData(daisy);
        System.out.println("updatedDaisy = " + updatedDaisy);
//        boolean success = contacts.replace("Daisy Duck", repalcedContact, updatedDaisy);
        boolean success = contacts.replace("Daisy Duck", daisy, updatedDaisy);
        if(success) {
            System.out.println("Successfully replaced element");
        } else {
            System.out.printf("Did not match on both key: %s and value: %s %n"
                    .formatted("Daisy Duck", repalcedContact));
        }
        contacts.forEach((k, v) -> System.out.println("key = "+ k + ", value = "+ v));

        System.out.println("----------------------------");
        success = contacts.remove("Daisy Duck", daisy);
        if(success) {
            System.out.println("Successfully removed element");
        } else {
            System.out.printf("Did not match on both key: %s and value: %s %n"
                    .formatted("Daisy Duck", daisy));
        }
        contacts.forEach((k, v) -> System.out.println("key = "+ k + ", value = "+ v));
    }
}
