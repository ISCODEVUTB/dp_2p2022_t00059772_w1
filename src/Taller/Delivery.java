package Taller;

public class Delivery {
    public Order order;
    public DeliveryStatus status;
    public Track track;
    public Internal driver;
    public Position position;

    /**
     * Metodo Constructor de la clase Delivery recibe como parametro:
     * @param order
     * @param status
     * @param track
     * @param driver
     * @param position
     */
    public Delivery(Order order, DeliveryStatus status, Track track, Internal driver, Position position) {
        this.order = order;
        this.status = status;
        this.track = track;
        this.driver = driver;
        this.position = position;
    }

    /**
     * ggeter order
     * @return order
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Setter de order recibe como parametro:
     * @param order
     */
    public void setOrder(Order order) {
        this.order = order;
    }

    /**
     * getter de status
     * @return status
     */
    public DeliveryStatus getStatus() {
        return status;
    }

    /**
     * Setter de status recibe como parametro:
     * @param status
     */
    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    /**
     * getter de track
     * @return track
     */
    public Track getTrack() {
        return track;
    }

    /**
     * Setter de track recibe como parametro:
     * @param track
     */
    public void setTrack(Track track) {
        this.track = track;
    }

    /**
     * getter de driver
     * @return driver
     */
    public Internal getDriver() {
        return driver;
    }

    /**
     * Setter de driver recibe como parametro:
     * @param driver
     */
    public void setDriver(Internal driver) {
        this.driver = driver;
    }

    /**
     * getter de position
     * @return position
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Setter de position recibe como parametro:
     * @param position
     */
    public void setPosition(Position position) {
        this.position = position;
    }
    
    /**
     *getter de watchPositon
     * @return coor
     */
    public Position watchPositon(){
        Position coor = null;
        return coor;
    }
    
    /**
     * getter de CurrentPosition
     * @return coor
     */
    public Position getCurrentPosition(){
        Position coor = null;
        return coor;
    }
    
    private void setCurrentPosition(Position position){
        this.position = position;
    }

    /**
     * Metodo To string 
     * @return un string con la informacion de la clase
     */
    @Override
    public String toString() {
        return "Delivery{" + "order=" + order + ", status=" + status + ", track=" + track + ", driver=" + driver + ", position=" + position + '}';
    }
    
}
