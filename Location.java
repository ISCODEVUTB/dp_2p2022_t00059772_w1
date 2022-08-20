package Taller;

public class Location {

    public String country, state, city, addressLine1, addressLine2;
    public int zipCode;

    /**
     * Metodo Constructor de la clase Location recibe como parametro:
     *
     * @param country
     * @param state
     * @param city
     * @param addressLine1
     * @param addressLine2
     * @param zipCode
     */
    public Location(String country, String state, String city, String addressLine1, String addressLine2, int zipCode) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.zipCode = zipCode;
    }

    /**
     * getter de country
     *
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter del country recibe como parametro:
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * getter de state
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * Setter del state recibe como parametro:
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * getter de city
     *
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter del city recibe como parametro:
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * getter de addressLine1
     *
     * @return addressLine1
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Setter del addressLine1 recibe como parametro:
     *
     * @param addressLine1
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * getter de addressLine2
     *
     * @return addressLine2
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Setter del addressLine2 recibe como parametro:
     *
     * @param addressLine2
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * getter zipCode
     *
     * @return zipCode
     */
    public int getZipCode() {
        return zipCode;
    }

    /**
     * Setter del zipCode recibe como parametro:
     *
     * @param zipCode
     */
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Metodo To string
     *
     * @return un string con la informacion de la clase
     */
    @Override
    public String toString() {
        return "Location{" + "country=" + country + ", state=" + state + ", city=" + city + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", zipCode=" + zipCode + '}';
    }

}
