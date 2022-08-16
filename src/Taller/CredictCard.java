package Taller;

import java.util.Date;


public class CredictCard {
    public String cvv, expiryYear, experyMonth;
    public int number, zipCode;
    public Date expetyDate;

    public CredictCard(String cvv, String expiryYear, String experyMonth, int number, int zipCode, Date expetyDate) {
        this.cvv = cvv;
        this.expiryYear = expiryYear;
        this.experyMonth = experyMonth;
        this.number = number;
        this.zipCode = zipCode;
        this.expetyDate = expetyDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(String expiryYear) {
        this.expiryYear = expiryYear;
    }

    public String getExperyMonth() {
        return experyMonth;
    }

    public void setExperyMonth(String experyMonth) {
        this.experyMonth = experyMonth;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Date getExpetyDate() {
        return expetyDate;
    }

    public void setExpetyDate(Date expetyDate) {
        this.expetyDate = expetyDate;
    }

    /**
     * Metodo To string 
     * @return un string con la informacion de la clase
     */
    @Override
    public String toString() {
        return "CredictCard{" + "cvv=" + cvv + ", expiryYear=" + expiryYear + ", experyMonth=" + experyMonth + ", number=" + number + ", zipCode=" + zipCode + ", expetyDate=" + expetyDate + '}';
    }
    
    public boolean validation(){
        boolean validation = false;
        return validation;
    }
}
