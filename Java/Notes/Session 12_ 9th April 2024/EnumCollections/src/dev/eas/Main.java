package dev.eas;

import java.util.*;

public class Main {

    enum WeekDay {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    public static void main(String[] args) {
        List<WeekDay> eashaanWorkDays = new ArrayList<>(List.of(WeekDay.MONDAY, WeekDay.TUESDAY,
                                                WeekDay.THURSDAY, WeekDay.FRIDAY));

        var eashaanDaysSet = EnumSet.copyOf(eashaanWorkDays);
        System.out.println(eashaanDaysSet.getClass().getSimpleName());
        eashaanDaysSet.forEach(System.out::println);

        var allDaysSet = EnumSet.allOf(WeekDay.class);
        System.out.println("-----------------------");
        allDaysSet.forEach(System.out::println);

        Set<WeekDay> newPersonDays = EnumSet.complementOf(eashaanDaysSet);
        System.out.println("-----------------------");
        newPersonDays.forEach(System.out::println);

        Set<WeekDay> anotherWay = EnumSet.copyOf(allDaysSet);
        anotherWay.removeAll(eashaanDaysSet);
        System.out.println("-----------------------");
        anotherWay.forEach(System.out::println);

        Set<WeekDay> businessDays = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
        System.out.println("-----------------------");
        businessDays.forEach(System.out::println);

        Map<WeekDay, String[]> employeeMap = new EnumMap<>(WeekDay.class);
        employeeMap.put(WeekDay.FRIDAY, new String[]{"Radha", "Krishna", "Gopi"});
        employeeMap.put(WeekDay.MONDAY, new String[]{"Krishna", "Gopi"});
        employeeMap.forEach(
                (k,v) -> System.out.println(k + ": " + Arrays.toString(v)));

    }
}
