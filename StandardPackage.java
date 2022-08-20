package Taller;

public class StandardPackage extends Package {

    public float quota;

    /**
     * Constructor de Standardpackage que extiende los atributos de package y
     * recibe como parametro:
     *
     * @param quota
     * @param id
     * @param description
     * @param code
     * @param gramsPrice
     * @param basePrice
     * @param weight
     * @param customer
     */
    public StandardPackage(float quota, String id, String description, int code, float gramsPrice, float basePrice, float weight, Customer customer) {
        super(id, description, code, gramsPrice, basePrice, weight, customer);
        this.quota = quota;
    }

    /**
     * Getter de Quota
     *
     * @return quota
     */
    public float getQuota() {
        return quota;
    }

    /**
     * setter de Quota que recibe como parametro:
     *
     * @param quota
     */
    public void setQuota(float quota) {
        this.quota = quota;
    }

    /**
     * Metodo To string
     *
     * @return un string con la informacion de la clase
     */
    @Override
    public String toString() {
        return "StandardPackage{" + "quota=" + quota + '}';
    }

    /**
     * Metodo calculate recibe como parametro:
     *
     * @param a
     * @param b
     * @param c
     * @return un float con el valor a pagar
     */
    public float calculate(float a, float b, float c) {
        return (a * b) + c;
    }

}
