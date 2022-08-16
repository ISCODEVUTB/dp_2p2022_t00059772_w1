package Taller;

public class Internal extends Person {
    public Role role;
    private BankAccount account;

    /**
     * Metodo Constructor de la clase Internal que extiende los atributos de person y recibe como parametro:
     * @param role
     * @param account
     * @param id
     * @param nationalId
     * @param idType
     * @param name
     * @param email
     * @param lastName
     * @param location
     * @param personType
     */
    public Internal(Role role, BankAccount account, String id, String nationalId, String idType, String name, String email, String lastName, Location location, PersonType personType) {
        super(id, nationalId, idType, name, email, lastName, location, personType);
        this.role = role;
        this.account = account;
    }

    /**
     * getter de role
     * @return role
     */
    public Role getRole() {
        return role;
    }

    /**
     * Setter del role recibe como parametro:
     * @param role
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * getter de account
     * @return account
     */
    public BankAccount getAccount() {
        return account;
    }

    /**
     * Setter del account recibe como parametro:
     * @param account
     */
    public void setAccount(BankAccount account) {
        this.account = account;
    }

    /**
     * Metodo biometricValidation que sirva para validar la persona y retorna un boolean
     * @return boolean 
     */
    @Override
    public boolean biometricValidation() {
        return super.biometricValidation();
    }

    /**
     * Metodo To string 
     * @return un string con la informacion de la clase
     */
    @Override
    public String toString() {
        return "Internal{" + "role=" + role + ", account=" + account + '}';
    }
}
