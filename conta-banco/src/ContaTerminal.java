import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e obter o número da agência
        // System.out.println("Por favor, digite o número da Agência:");
        System.out.println("Por favor, digite o numero da Agencia:");
        String agencia = scanner.nextLine();

        // Solicitar e obter o número da conta
        // System.out.println("Por favor, digite o número da Conta:");
        System.out.println("Por favor, digite o numero da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        // Solicitar e obter o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicitar e obter o saldo
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem de conta criada com as informações inseridas pelo usuário
        // System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia eh " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque.");

        // Fechar o scanner
        scanner.close();
    }
}
