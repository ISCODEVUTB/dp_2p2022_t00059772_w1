package Taller;

/**
 * Package es una clase abstracta y representa un Paquete que se va a enviar.
 *
 * @author danie
 */
public abstract class Package {

    public String id, description;
    public int code;
    public float gramsPrice, basePrice, weight;
    Customer customer;

    /**
     * Metodo Constructor de la clase Package recibe como parametro:
     *
     * @param id Identificaion del paquete
     * @param description descripcion del paquete
     * @param code codigo del paquete
     * @param gramsPrice Precio por gramo del paquete
     * @param basePrice Base del precio del paquete
     * @param weight Peso del paquete
     * @param customer Persona que va a enviar el paquete
     */
    public Package(String id, String description, int code, float gramsPrice, float basePrice, float weight, Customer customer) {
        this.id = id;
        this.description = description;
        this.code = code;
        this.gramsPrice = 1000 * gramsPrice;
        this.basePrice = basePrice;
        this.weight = weight;
        this.customer = customer;
    }

    /**
     * Getter del id
     *
     * @return La identificacion del paquete
     */
    public String getId() {
        return id;
    }

    /**
     * Setter de id recibe como parametro:
     *
     * @param id Una variable de tipo String
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter del id
     *
     * @return La identificacion del paquete
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter de description recibe como parametro:
     *
     * @param description Una variable de tipo String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter del code
     *
     * @return el codigo del paquete
     */
    public int getCode() {
        return code;
    }

    /**
     * Setter de code recibe como parametro:
     *
     * @param code Una variable de tipo String
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Getter de GramsPrice
     *
     * @return el precio por gramo del paquete
     */
    public float getGramsPrice() {
        return gramsPrice;
    }

    /**
     * Setter de grams recibe como parametro:
     *
     * @param gramsPrice
     */
    public void setGramsPrice(float gramsPrice) {
        this.gramsPrice = gramsPrice;
    }

    /**
     * Getter de BasePrice
     *
     * @return basePrice
     */
    public float getBasePrice() {
        return basePrice;
    }

    /**
     * Setter de baseprice recibe como parametro:
     *
     * @param basePrice
     */
    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * Getter de Weight
     *
     * @return weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Setter de weight recibe como parametro:
     *
     * @param weight
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Getter de Customer
     *
     * @return customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Setter de customer recibe como parametro:
     *
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Metodo To string
     *
     * @return un string con la informacion de la clase
     */
    @Override
    public String toString() {
        return "Package{" + "id=" + id + ", description=" + description + ", code=" + code + ", gramsPrice=" + gramsPrice + ", basePrice=" + basePrice + ", weight=" + weight + ", customer=" + customer + '}';
    }

    /**
     * Metodo calculate recibe como parametro:
     *
     * @param a
     * @param b
     * @return un float con el valor a pagar
     */
    public float calculate(float a, float b) {
        return a * b;
    }
}
