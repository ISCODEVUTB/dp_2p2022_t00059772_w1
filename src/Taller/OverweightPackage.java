package Taller;

public class OverweightPackage extends Package {
    public float overweight;

    /**
     * Constructor de Overweightpackage que extiende los atributos de package y recibe como parametro:
     * @param id
     * @param description
     * @param code
     * @param gramsPrice
     * @param basePrice
     * @param weight
     * @param customer
     */
    public OverweightPackage(String id, String description, int code, float gramsPrice, float basePrice, float weight, Customer customer) {
        super(id, description, code, gramsPrice, basePrice, weight, customer);
    }

    /**
     * Getter de Overweight
     * @return overweight
     */
    public float getOverweight() {
        return overweight;
    }

    /**
     * Setter de Overweight que recibe como parametro
     * @param overweight
     */
    public void setOverweight(float overweight) {
        this.overweight = overweight;
    }

    /**
     * Metodo To string 
     * @return un string con la informacion de la clase
     */
    @Override
    public String toString() {
        return "OverweightPackage{" + "overweight=" + overweight + '}';
    }

    /**
     * Metodo calculate recibe como parametro:
     * @param a
     * @param b
     * @param c
     * @return un float con el valor a pagar
     */
    public float calculate(float a, float b, float c) {
        return (a*b)+c;
    }
}