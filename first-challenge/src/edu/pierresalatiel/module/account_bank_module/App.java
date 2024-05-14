package edu.pierresalatiel.module.account_bank_module;

import edu.pierresalatiel.module.input_output_data.AccountInputData;
import edu.pierresalatiel.module.interface_module.UserInterface;
import edu.pierresalatiel.module.validators.DataValidator;

public class App {
    final UserInterface userInterface = new UserInterface();
    final DataValidator dataValidator = new DataValidator();
    final AccountInputData accountInputData = new AccountInputData();

    public static void main(String[] args) {
        new App().start();
    }

    private void start() {
        System.out.println("----------------------------------------------------------------");
        String clientName = userInterface.askForClientName();
        if (!userInterface.askIfCreateNewAccount()) {
            userInterface.thankYou();
            userInterface.closeScanner();
            return;
        }

        createAccount(clientName);
        userInterface.closeScanner();
    }

    private void createAccount(String clientName) {
        int accountNumber;
        do {
            accountNumber = userInterface.askForAccountNumber();
        } while (!dataValidator.isValidAccountNumber(accountNumber));

        String agencyNumber;
        do {
            agencyNumber = userInterface.askForAgencyNumber();
        } while (!dataValidator.isValidAgencyNumber(agencyNumber));

        if (!userInterface.confirmClientName(clientName)) {
            System.out.print("Insira o nome correto do proprietário da conta: ");
            clientName = userInterface.askForClientName();
        }

        double totalAmount;
        System.out.print("Digite o saldo da conta a depositar: ");
        totalAmount = userInterface.askForTotalAmount();

        accountInputData.setClientName(clientName);
        accountInputData.setAccountNummber(accountNumber);
        accountInputData.setAgency(agencyNumber);
        accountInputData.setTotalAmount(totalAmount);

        userInterface.displayAccountDetails(accountInputData);
    }
}
