import java.util.Scanner;
public class ContaTerminal {
    public static String formatarSaldo (double saldo) {
        return "R$ " + String.format("%.2f", saldo);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        double saldo;
        String agencia, nomeCliente;

        System.out.println("Criação de conta bancária iniciada:");
        System.out.println("Por favor, digite a agência:");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da agência:");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite seu nome completo:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, insira seu saldo inicial:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + formatarSaldo(saldo) +
                " já está disponível");

    }
}
