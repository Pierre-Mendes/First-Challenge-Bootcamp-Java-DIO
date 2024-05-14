package edu.pierresalatiel.module.input_output_data;

public class AccountInputData {

    private int accountNummber;
    private double totalAmount;
    private String clientName;
    private String agency;

    public int getAccountNummber() {
        return accountNummber;
    }

    public void setAccountNummber(int accountNummber) {
        this.accountNummber = accountNummber;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }
}
