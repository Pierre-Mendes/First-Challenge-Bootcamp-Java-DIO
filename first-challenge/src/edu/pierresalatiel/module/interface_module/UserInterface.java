package edu.pierresalatiel.module.interface_module;

import edu.pierresalatiel.module.input_output_data.AccountInputData;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);

    public String askForClientName() {
        return scanner.next();
    }

    public boolean askIfCreateNewAccount() {
        System.out.print("Deseja criar uma nova conta? (S - Sim / N - Não) ");
        char wantCreateAccount = Character.toUpperCase(scanner.next().charAt(0));
        return wantCreateAccount == 'S';
    }

    public int askForAccountNumber() {
        System.out.print("Digite o número da conta (4 dígitos): ");
        return scanner.nextInt();
    }

    public String askForAgencyNumber() {
        System.out.print("Digite a agência (formato 123-4): ");
        return scanner.next();
    }

    public double askForTotalAmount() {
        return scanner.nextDouble();
    }

    public boolean confirmClientName(String clientName) {
        System.out.println("** Seja Bem Vindo ao Cadastro de contas bancárias ** " + clientName);
        System.out.println("Confirme seu nome: " + clientName);
        System.out.print("Seu nome está correto? (S - Sim / N - Não) ");
        char hasCorrectName = Character.toUpperCase(scanner.next().charAt(0));
        return hasCorrectName == 'S';
    }

    public void displayAccountDetails(AccountInputData accountInputData) {
        System.out.println("Conta criada com sucesso! ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Proprietário da conta: " + accountInputData.getClientName());
        System.out.println("Número da conta: " + accountInputData.getAccountNummber());
        System.out.println("Agência: " + accountInputData.getAgency());
        System.out.println("Saldo da conta: " + accountInputData.getTotalAmount());
        System.out.println("----------------------------------------------------------------");
    }

    public void thankYou() {
        System.out.print("Certo! Obrigado pelo contato. ");
    }

    public void closeScanner() {
        scanner.close();
    }

}
