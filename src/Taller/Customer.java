package Taller;

public class Customer extends Person {
    public Invoice invoices;
    public Location shipping;
    private CredictCard creditCards;

    /**
     * Metodo Constructor de la clase Customer que extiende los atributos de person y recibe como parametro:
     * @param invoices
     * @param shipping
     * @param creditCards
     * @param id
     * @param nationalId
     * @param idType
     * @param name
     * @param email
     * @param lastName
     * @param location
     * @param personType
     */
    public Customer(Invoice invoices, Location shipping, CredictCard creditCards, String id, String nationalId, String idType, String name, String email, String lastName, Location location, PersonType personType) {
        super(id, nationalId, idType, name, email, lastName, location, personType);
        this.invoices = invoices;
        this.shipping = shipping;
        this.creditCards = creditCards;
    }

    /**
     * getter de invoices
     * @return invoices
     */
    public Invoice getInvoices() {
        return invoices;
    }

    /**
     * Setter del invoices recibe como parametro:
     * @param invoices
     */
    public void setInvoices(Invoice invoices) {
        this.invoices = invoices;
    }

    /**
     * getter de shipping
     * @return shipping
     */
    public Location getShipping() {
        return shipping;
    }

    /**
     * Setter del shipping recibe como parametro:
     * @param shipping
     */
    public void setShipping(Location shipping) {
        this.shipping = shipping;
    }

    /**
     * getter de creditCards
     * @return creditCards
     */
    public CredictCard getCreditCards() {
        return creditCards;
    }

    /**
     * Setter del creditCards recibe como parametro:
     * @param creditCards
     */
    public void setCreditCards(CredictCard creditCards) {
        this.creditCards = creditCards;
    }

    /**
     * Metodo To string 
     * @return un string con la informacion de la clase
     */
    @Override
    public String toString() {
        return "Customer{" + "invoices=" + invoices + ", shipping=" + shipping + ", creditCards=" + creditCards + '}';
    }
    
    /**
     * Metodo biometricValidation que sirva para validar la persona y retorna un boolean
     * @return boolean 
     */
    @Override
    public boolean biometricValidation() {
        return super.biometricValidation(); 
    }
    
    
}