package ch11.lx.q2;

public class StartCustomer {
    public static void main(String[] args) {

        CardType card = new CardType();
        card.cardType = "vip";
        card.show();

        Points points = new Points();
        points.points = 10000;
        points.show();


    }
}
