package kg.megacom;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Comparator<Ticket> comparator = new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                return o1.getCost() - o2.getCost();
            }
        };
        PriorityQueue<Ticket> firstPriorityQueue = new PriorityQueue<>(comparator);
        firstPriorityQueue.add(new Ticket(1200, false));
        firstPriorityQueue.add(new Ticket(1300, true));
        firstPriorityQueue.add(new Ticket(1700, true));
        firstPriorityQueue.add(new Ticket(1000, false));
        firstPriorityQueue.add(new Ticket(1100, false));
        firstPriorityQueue.add(new Ticket(1500, true));
        firstPriorityQueue.add(new Ticket(1900, true));
        PriorityQueue<Ticket> secondPriorityQueue = new PriorityQueue<>(new ComparatorToCompare());
        secondPriorityQueue.add(new Ticket(1300, false));
        secondPriorityQueue.add(new Ticket(1900, true));
        secondPriorityQueue.add(new Ticket(1000, false));
        secondPriorityQueue.add(new Ticket(1400, true));
        secondPriorityQueue.add(new Ticket(1500, true));
        secondPriorityQueue.add(new Ticket(1100, false));
        secondPriorityQueue.add(new Ticket(1200, false));

        for (Ticket i : firstPriorityQueue) {
            System.out.println(i);
        }
        System.out.println("\nQueues that are prioritized at a higher price");
        while (!firstPriorityQueue.isEmpty()) {
            System.out.println("-------------------------- " + firstPriorityQueue.poll().getCost());
        }
        System.out.println("--------------------------------");
        for (Ticket i : secondPriorityQueue) {
            System.out.println(i);
        }
        System.out.println("\nQueues that are more VIP priority");
        while (!secondPriorityQueue.isEmpty()) {
            System.out.println("-------------------------- " + secondPriorityQueue.poll().isVIP());
        }
    }
}
