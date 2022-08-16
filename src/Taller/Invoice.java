package Taller;


public class Invoice {
    public String id;
    public float tax, price, discoint;
    public Order orders;
    public InvoiceStatus status;
    public Customer client;
    public PaymentMethodsTypes paymentMethod;

    /**
     * Metodo Constructor de la clase Invoice recibe como parametro:
     * @param id
     * @param tax
     * @param price
     * @param discoint
     * @param orders
     * @param status
     * @param client
     * @param paymentMethod
     */
    public Invoice(String id, float tax, float price, float discoint, Order orders, InvoiceStatus status, Customer client, PaymentMethodsTypes paymentMethod) {
        this.id = id;
        this.tax = tax;
        this.price = price;
        this.discoint = discoint;
        this.orders = orders;
        this.status = status;
        this.client = client;
        this.paymentMethod = paymentMethod;
    }

    /**
     * getter de id
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter de id recibe como parametro:
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * getter de tax
     * @return tax
     */
    public float getTax() {
        return tax;
    }

    /**
     * Setter de tax recibe como parametro:
     * @param tax
     */
    public void setTax(float tax) {
        this.tax = tax;
    }

    /**
     * getter de price
     * @return price
     */
    public float getPrice() {
        return price;
    }

    /**
     * Setter de price recibe como parametro:
     * @param price
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * getter de discoint
     * @return discoint
     */
    public float getDiscoint() {
        return discoint;
    }

    /**
     * Setter de discoint recibe como parametro:
     * @param discoint
     */
    public void setDiscoint(float discoint) {
        this.discoint = discoint;
    }

    /**
     * getter de orders
     * @return orders
     */
    public Order getOrders() {
        return orders;
    }

    /**
     * Setter de orders recibe como parametro:
     * @param orders
     */
    public void setOrders(Order orders) {
        this.orders = orders;
    }

    /**
     * getter de status
     * @return status
     */
    public InvoiceStatus getStatus() {
        return status;
    }

    /**
     * Setter de status recibe como parametro:
     * @param status
     */
    public void setStatus(InvoiceStatus status) {
        this.status = status;
    }

    /**
     * getter de client
     * @return client
     */
    public Customer getClient() {
        return client;
    }

    /**
     * Setter de client recibe como parametro:
     * @param client
     */
    public void setClient(Customer client) {
        this.client = client;
    }

    /**
     * getter de paymentMethod
     * @return paymentMethod
     */
    public PaymentMethodsTypes getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter de paymentMethod recibe como parametro:
     * @param paymentMethod
     */
    public void setPaymentMethod(PaymentMethodsTypes paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Metodo To string 
     * @return un string con la informacion de la clase
     */
    @Override
    public String toString() {
        return "Invoice{" + "id=" + id + ", tax=" + tax + ", price=" + price + ", discoint=" + discoint + ", orders=" + orders + ", status=" + status + ", client=" + client + ", paymentMethod=" + paymentMethod + '}';
    }
    
}