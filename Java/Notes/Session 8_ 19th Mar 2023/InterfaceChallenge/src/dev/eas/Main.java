package dev.eas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Mumbai High Court", UsageType.GOVERNMENT));
        mappables.add(new Building("Maratha Mandir", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Wankedhe Stadium", UsageType.SPORTS));
        mappables.add(new UtilityLine("College St.", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("MG Road", UtilityType.WATER));

        for (var m : mappables) {
            Mappable.mapIt(m);
        }
    }
}
