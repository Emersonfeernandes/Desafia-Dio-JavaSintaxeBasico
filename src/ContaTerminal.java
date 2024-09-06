
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua Conta!");
        int Numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String Agencia = scanner.next();

        System.out.println("Por favor, digite seu Nome!");
        String NomeCliente = scanner.next();

        System.out.println("Por favor, digite seu Saldo!");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + Agencia +
        ", conta " + Numero + " e seu saldo de " + Saldo + " já está disponível para saque.");
    }
}
