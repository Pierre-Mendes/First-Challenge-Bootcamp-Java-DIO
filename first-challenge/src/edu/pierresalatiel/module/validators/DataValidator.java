package edu.pierresalatiel.module.validators;

public class DataValidator {

    public boolean isValidAccountNumber(int accountNumber) {
        return String.valueOf(accountNumber).length() == 4;
    }

    public boolean isValidAgencyNumber(String agencyNumber) {
        return agencyNumber.matches("\\d{3}-\\d");
    }

}
