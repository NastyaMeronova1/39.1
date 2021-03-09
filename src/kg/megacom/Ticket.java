package kg.megacom;

public class Ticket {
    private int cost;
    private boolean isVIP;

    public Ticket(int cost, boolean isVIP) {
        this.cost = cost;
        this.isVIP = isVIP;
    }

    public Ticket() {

    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "cost=" + cost +
                ", isVIP=" + isVIP +
                '}';
    }
}
