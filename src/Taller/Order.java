package Taller;

public class Order {
    public String id;
    public Package packages;
    public boolean paid;
    public float price;
    public Customer receiver, sender;
    public OrderStatus status;
    public Location location;

    /**
     * Metodo Constructor de la clase order recibe como parametro:
     * @param id
     * @param packages
     * @param paid
     * @param price
     * @param receiver
     * @param sender
     * @param status
     * @param location
     */
    public Order(String id, Package packages, boolean paid, float price, Customer receiver, Customer sender, OrderStatus status, Location location) {
        this.id = id;
        this.packages = packages;
        this.paid = paid;
        this.price = price;
        this.receiver = receiver;
        this.sender = sender;
        this.status = status;
        this.location = location;
    }

    /**
     * getter de id
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter del id recibe como parametro:
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * getter de packages
     * @return packages
     */
    public Package getPackages() {
        return packages;
    }

    /**
     * Setter del packages recibe como parametro:
     * @param packages
     */
    public void setPackages(Package packages) {
        this.packages = packages;
    }

    /**
     * getter  paid
     * @return paid
     */
    public boolean isPaid() {
        return paid;
    }

    /**
     * Setter del paid recibe como parametro:
     * @param paid
     */
    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    /**
     * getter price
     * @return price
     */
    public float getPrice() {
        return price;
    }

    /**
     * Setter del price recibe como parametro:
     * @param price
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * getter de receiver
     * @return receiver
     */
    public Customer getReceiver() {
        return receiver;
    }

    /**
     * Setter del receiver recibe como parametro:
     * @param receiver
     */
    public void setReceiver(Customer receiver) {
        this.receiver = receiver;
    }

    /**
     * getter de sender
     * @return sender
     */
    public Customer getSender() {
        return sender;
    }

    /**
     * Setter del sender recibe como parametro:
     * @param sender
     */
    public void setSender(Customer sender) {
        this.sender = sender;
    }

    /**
     * getter de status
     * @return status
     */
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * Setter del status recibe como parametro:
     * @param status
     */
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    /**
     * getter de location
     * @return location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Setter del location recibe como parametro:
     * @param location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Metodo To string 
     * @return un string con la informacion de la clase
     */
    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", packages=" + packages + ", paid=" + paid + ", price=" + price + ", receiver=" + receiver + ", sender=" + sender + ", status=" + status + ", location=" + location + '}';
    }
}
