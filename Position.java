package Taller;

/**
 * Clase para conocer la posicion de los envios
 *
 * @author danie
 */
public class Position {

    public float lat, ing;

    /**
     * Constructor de la Clase Position que recibe como parametro
     *
     * @param lat Latitud
     * @param ing Longitud
     */
    public Position(float lat, float ing) {
        this.lat = lat;
        this.ing = ing;
    }

    /**
     * Getter de la latitud
     *
     * @return
     */
    public float getLat() {
        return lat;
    }

    /**
     * Setter de lat recibe como parametro:
     *
     * @param lat
     */
    public void setLat(float lat) {
        this.lat = lat;
    }

    /**
     * Getter de la longitud
     *
     * @return
     */
    public float getIng() {
        return ing;
    }

    /**
     * Setter de ing recibe como parametro:
     *
     * @param ing
     */
    public void setIng(float ing) {
        this.ing = ing;
    }

    /**
     * Metodo To string
     *
     * @return un string con la informacion de la clase
     */
    @Override
    public String toString() {
        return "Position{" + "lat=" + lat + ", ing=" + ing + '}';
    }

}
