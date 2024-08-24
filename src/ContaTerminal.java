import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da sua agência: ");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite a sua agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, numeroAgencia, saldo);
    }
}
