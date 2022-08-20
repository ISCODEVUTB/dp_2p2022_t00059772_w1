package Taller;

public class Track {

    public String id;
    public float maxWeight, currentWeight;
    public TrackType type;
    public TrackStatus status;

    /**
     * Metodo Constructor de la clase track recibe como parametro:
     *
     * @param id
     * @param maxWeight
     * @param currentWeight
     * @param type
     * @param status
     */
    public Track(String id, float maxWeight, float currentWeight, TrackType type, TrackStatus status) {
        this.id = id;
        this.maxWeight = maxWeight;
        this.currentWeight = currentWeight;
        this.type = type;
        this.status = status;
    }

    /**
     * getter de id
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter del id recibe como parametro:
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * getter de maxWeight
     *
     * @return maxWeight
     */
    public float getMaxWeight() {
        return maxWeight;
    }

    /**
     * Setter del maxWeight recibe como parametro:
     *
     * @param maxWeight
     */
    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }

    /**
     * getter de currentWeight
     *
     * @return currentWeight
     */
    public float getCurrentWeight() {
        return currentWeight;
    }

    /**
     * Setter del currentWeight recibe como parametro:
     *
     * @param currentWeight
     */
    public void setCurrentWeight(float currentWeight) {
        this.currentWeight = currentWeight;
    }

    /**
     * getter de type
     *
     * @return type
     */
    public TrackType getType() {
        return type;
    }

    /**
     * Setter del type recibe como parametro:
     *
     * @param type
     */
    public void setType(TrackType type) {
        this.type = type;
    }

    /**
     * getter de status
     *
     * @return status
     */
    public TrackStatus getStatus() {
        return status;
    }

    /**
     * Setter del status recibe como parametro:
     *
     * @param status
     */
    public void setStatus(TrackStatus status) {
        this.status = status;
    }
}
