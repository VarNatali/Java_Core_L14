package ua.lviv.lga.Less14.task02.Comparator;

import ua.lviv.lga.Less14.task02.Commodity;

import java.util.Comparator;

public class CommoditySortName implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        }
        return 0;
    }
}
