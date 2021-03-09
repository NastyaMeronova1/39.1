package kg.megacom;

import java.util.Comparator;

public class ComparatorToCompare implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        if (o1.isVIP() == o2.isVIP()) {
            return 0;
        } else if (o1.isVIP() != o2.isVIP()) {
            return 1;
        }
        return -1;
    }
}
