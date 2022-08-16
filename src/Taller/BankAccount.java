package Taller;


public class BankAccount {
    public String accountId, bankName, bankId;

    /**
     * Metodo Constructor de la clase BanckAccount recibe como parametro:
     * @param accountId
     * @param bankName
     * @param bankId
     */
    public BankAccount(String accountId, String bankName, String bankId) {
        this.accountId = accountId;
        this.bankName = bankName;
        this.bankId = bankId;
    }

    /**
     * Getter de accountId
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Setter del accountId recibe como parametro:
     * @param accountId
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * getter bankName
     * @return bankName
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Setter del bankName recibe como parametro:
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * getter de bankId
     * @return bankId
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * Setter del bankId recibe como parametro:
     * @param bankId
     */
    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    /**
     * Metodo To string 
     * @return un string con la informacion de la clase
     */
    @Override
    public String toString() {
        return "BankAccount{" + "accountId=" + accountId + ", bankName=" + bankName + ", bankId=" + bankId + '}';
    }
    
    /**
     * Metodo deposit recibe como parametro
     * @param amount
     * @return un boolean 
     */
    public boolean deposit(float amount){
        boolean deposited = false;
        return deposited;
    }
}
