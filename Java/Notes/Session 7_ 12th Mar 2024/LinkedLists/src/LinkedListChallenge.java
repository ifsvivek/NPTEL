import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class LinkedListChallenge {
    public static void main(String[] args) {
        LinkedList<Place> placestoVisit = new LinkedList<>();
        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placestoVisit, adelaide);
        addPlace(placestoVisit, new Place("adelaide", 1374));
        addPlace(placestoVisit, new Place("Brisbane", 917));
        addPlace(placestoVisit, new Place("Perth", 3923));
        addPlace(placestoVisit, new Place("Alice Springs", 2771));
        addPlace(placestoVisit, new Place("Darwin", 3972));
        addPlace(placestoVisit, new Place("Melbourne", 877));

        placestoVisit.addFirst(new Place("Sydney", 0));
        System.out.println(placestoVisit);

        var iterator = placestoVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {
            if(!iterator.hasPrevious()) {
                System.out.println("Originating : "+ iterator.next());
                forward = true;
            }

            if(!iterator.hasNext()) {
                System.out.println("Final : "+ iterator.previous());
                forward = false;
            }

            System.out.print("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch (menuItem) {
                case "F":
                    System.out.println("User wants to go forward");
                    if(!forward) {          // Reversing Direction
                        forward = true;
                        if(iterator.hasNext()){
                            iterator.next();  // Adjust forward position
                        }
                    }
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;

                case "B":
                    System.out.println("User wants to go backwards");
                    if(forward) {          // Reversing Direction
                        forward = false;
                        if(iterator.hasPrevious()){
                            iterator.previous();  // Adjust backward position
                        }
                    }
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;

                case "M":
                    printMenu();
                    break;

                case "L":
                    System.out.println(placestoVisit);
                    break;

                default:
                    quitLoop = true;
                    break;
            }
        }

    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if(list.contains(place)) {
            System.out.println("Found Duplicate: " + place);
            return;
        }

        for(Place p : list) {
            if(p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found Duplicate: " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for(var listPlace : list) {
            if(place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

    private static void printMenu(){
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
