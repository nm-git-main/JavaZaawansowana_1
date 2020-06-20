package EnumPrzyklad;

public class Order {
    private Status status;

    public enum Status {
        ORDER,
        ON_RUTE,
        DELIVERED
    }

    public boolean isDeliverd() {
        if (getStatus() == Status.DELIVERED) {
            return true;
        } else {
            return false;
        }
    }



    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
