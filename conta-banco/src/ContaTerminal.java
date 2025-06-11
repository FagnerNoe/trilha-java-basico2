import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeroDaconta;
        String agencia;
        String nomeDoCliente;
        double saldo;

        System.out.println("Digite o numero da conta :");
        numeroDaconta = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Por Favor, digite o nome da Agência!");
        agencia = entrada.nextLine();


        System.out.println("Digite o seu Nome : ");
        nomeDoCliente = entrada.nextLine();

        System.out.println("Digite o Saldo :");
        saldo = entrada.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco," +
                "sua agência é %s, conta %d e seu saldo %.2f já está disponivel para saque .",
                nomeDoCliente,agencia,numeroDaconta,saldo);


    }
}