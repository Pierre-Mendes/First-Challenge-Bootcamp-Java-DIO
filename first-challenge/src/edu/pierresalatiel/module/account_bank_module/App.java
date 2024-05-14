package edu.pierresalatiel.module.account_bank_module;

import edu.pierresalatiel.module.input_output_data.AccountInputData;
import java.util.Scanner;

public class App {

    private static AccountInputData accountInputData = new AccountInputData();
    private static Scanner scanner = new Scanner(System.in);
    private static App app = new App();

    public static void main(String[] args) throws Exception {
        System.out.println("----------------------------------------------------------------");
        app.welcomeMessage();
        app.createAccountBank();
    }

    private void welcomeMessage() {
        System.out.println("Olá Qual o seu nome? ");
        String clientName = scanner.next();
        accountInputData.setClientName(clientName);

        System.out.println("** Seja Bem Vindo ao Cadastro de contas bancárias ** " + accountInputData.getClientName());

        System.out.print("Deseja criar uma nova conta? (S - Sim / N - Não) ");
        char wantCreateAccont = Character.toUpperCase(scanner.next().charAt(0));

        if (wantCreateAccont == 'N') {
            System.out.print("Certo! Obrigado pelo contato. ");
            scanner.close();
        }

        if (wantCreateAccont == 'S') {
            scanner.nextLine();
            app.createAccountBank();
        }
    }

    private AccountInputData createAccountBank() {
        System.out.print("Digite o número da conta: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a agência: ");
        String agencyNumber = scanner.next();
        scanner.nextLine();

        System.out.println("Confirme seu nome: " + accountInputData.getClientName());

        System.out.print("Seu nome está correto? (S - Sim / N - Não) ");
        char hasCorrectName = Character.toUpperCase(scanner.next().charAt(0));
        scanner.nextLine();

        if (hasCorrectName == 'N') {
            System.out.print("Insira o nome correto do proprietário da conta: ");
            String ownerAccountName = scanner.next();

            accountInputData.setClientName(ownerAccountName);
            scanner.nextLine();
        }

        System.out.print("Digite o saldo da conta a depositar: ");
        double totalAmount = scanner.nextDouble();
        scanner.nextLine();

        accountInputData.setAccountNummber(accountNumber);
        accountInputData.setAgency(agencyNumber);
        accountInputData.setTotalAmount(totalAmount);

        System.out.println("Conta criada com sucesso! ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Proprietário da conta: " + accountInputData.getClientName());
        System.out.println("Número da conta: " + accountInputData.getAccountNummber());
        System.out.println("Agência: " + accountInputData.getAgency());
        System.out.println("Saldo da conta: " + accountInputData.getTotalAmount());
        System.out.println("----------------------------------------------------------------");
        scanner.nextLine();
        scanner.close();

        return accountInputData;
    }
}
