package Taller;


public abstract class Person {
    public String id, nationalId,idType, name, email, lastName;
    public Location location;
    public PersonType personType;

    /**
     * Metodo Constructor de la clase Package recibe como parametro:
     * @param id
     * @param nationalId
     * @param idType
     * @param name
     * @param email
     * @param lastName
     * @param location
     * @param personType
     */
    public Person(String id, String nationalId, String idType, String name, String email, String lastName, Location location, PersonType personType) {
        this.id = id;
        this.nationalId = nationalId;
        this.idType = idType;
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.location = location;
        this.personType = personType;
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
     * getter de nationalId
     * @return nationalId
     */
    public String getNationalId() {
        return nationalId;
    }

    /**
     * Setter del nationalId recibe como parametro:
     * @param nationalId
     */
    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    /**
     * getter de idType
     * @return idType
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Setter del idType recibe como parametro:
     * @param idType
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * getter de name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter del name recibe como parametro:
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter de email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter del email recibe como parametro:
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getter de lastName
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter del lastName recibe como parametro:
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
     * getter de personType
     * @return personType
     */
    public PersonType getPersonType() {
        return personType;
    }

    /**
     * Setter del personType recibe como parametro:
     * @param personType
     */
    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    /**
     * Metodo To string 
     * @return un string con la informacion de la clase
     */
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", nationalId=" + nationalId + ", idType=" + idType + ", name=" + name + ", email=" + email + ", lastName=" + lastName + ", location=" + location + ", personType=" + personType + '}';
    }
    
    /**
     * Metodo biometricValidation que sirva para validar la persona y retorna un boolean
     * @return boolean 
     */
    public boolean biometricValidation(){
        boolean validated = false;
        return validated;
    }
    
}
