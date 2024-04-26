package dev.eas;

import java.util.*;

public class TreeSetMain {
    public static void main(String[] args) {
        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone"); // these are unsorted

//        NavigableSet<Contact> sorted = new TreeSet<>(phones);
        // sorting the contact based on their names.
        // Here we are using a comparator to specify how to sort the elements in a TreeSet i.e. using Names
        Comparator<Contact> mySort = Comparator.comparing(Contact::getName);
        NavigableSet<Contact> sorted = new TreeSet<>(mySort);
        sorted.addAll(phones);
        sorted.forEach(System.out::println);

        // Extracting names and storing it in TreeSet (without explicitly specifying comparator
        // and then printing them out.
        NavigableSet<String> justNames = new TreeSet<>();
        phones.forEach(c -> justNames.add(c.getName()));
        System.out.println(justNames);

        // Here, we are mentioning the comparator during the invoking object for treeSet.
        NavigableSet<Contact> fullSet = new TreeSet<>(sorted);
        fullSet.addAll(emails);
        fullSet.forEach(System.out::println);

        // Sorting the list by combining two list based on alphabetical order
        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.sort(sorted.comparator());
        System.out.println("-------------------------");
        fullList.forEach(System.out::println);

        Contact min = Collections.min(fullSet, fullSet.comparator());
        Contact max = Collections.max(fullSet, fullSet.comparator());

        // first() and last() or min() or max() does not remove the element from the set.
        Contact first = fullSet.first();
        Contact last = fullSet.last();

        System.out.println("----------------------");
        System.out.printf("min = %s, first = %s %n", min.getName(), first.getName());
        System.out.printf("max = %s, last = %s %n", max.getName(), last.getName());
        System.out.println("----------------------");

        // pollFirst() and pollLast() also removes the element from the Set
        NavigableSet<Contact> copiedSet = new TreeSet<>(fullSet);
        System.out.println("First Element = " + copiedSet.pollFirst());
        System.out.println("Last Element = " + copiedSet.pollLast());
        copiedSet.forEach(System.out::println);
        System.out.println("----------------------");

        Contact daffy = new Contact("Daffy Duck");
        Contact daisy = new Contact("Daisy Duck");
        Contact snoopy = new Contact("Snoopy");
        Contact archie = new Contact("Archie");

        for (Contact c : List.of(daffy, daisy, last, snoopy)) {
            System.out.printf("ceiling(%s)=%s%n",c.getName(), fullSet.ceiling(c));
            System.out.printf("higher(%s)=%s%n",c.getName(), fullSet.higher(c));
        }
        System.out.println("----------------------");

        for (Contact c : List.of(daffy, daisy, first, archie)) {
            System.out.printf("floor(%s)=%s%n",c.getName(), fullSet.floor(c));
            System.out.printf("lower(%s)=%s%n",c.getName(), fullSet.lower(c));
        }
        System.out.println("----------------------");

        NavigableSet<Contact> descendingSet = fullSet.descendingSet();
        descendingSet.forEach(System.out::println);
        System.out.println("----------------------");

        // the removed element will also be reflected in orginal treeset output because of descendingSet()
        Contact lastContact = descendingSet.pollLast();
        System.out.println("Removed " + lastContact);
        descendingSet.forEach(System.out::println);
        System.out.println("----------------------");
        fullSet.forEach(System.out::println);
        System.out.println("----------------------");

        // create a subset from the original set
        // headset - starting till before the passed element
        Contact marion = new Contact("Maid Marion");
//        var headSet = fullSet.headSet(marion);
        var headSet = fullSet.headSet(marion, true); // include maid marion
        headSet.forEach(System.out::println);
        System.out.println("----------------------");

        // create a subset from the original set
        // tailset - including element all the element below it
//        var tailSet = fullSet.tailSet(marion);
        var tailSet = fullSet.tailSet(marion, false); //excludes maid marion
        tailSet.forEach(System.out::println);
        System.out.println("----------------------");

        Contact linus = new Contact("Linus Van Pelt");
//        var subset = fullSet.subSet(linus, marion); // includes linuse exclude marion
        var subset = fullSet.subSet(linus, false, marion, true);
        subset.forEach(System.out::println);
        System.out.println("----------------------");


    }
}
