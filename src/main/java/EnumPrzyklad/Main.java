package EnumPrzyklad;

public class Main {
    public static void main(String[] args) {
        Order.Status status = Order.Status.DELIVERED;
        Order order = new Order();
        order.setStatus(status);
        System.out.println(order.isDeliverd());

        switch (order.getStatus()) {
            case ON_RUTE:
                System.out.println("Jest w drodze");
                break;
            case ORDER:
                System.out.println("Jest zamowione");
                break;
            case DELIVERED:
                System.out.println("Jest dostarczone");
                break;
        }
    }
}
