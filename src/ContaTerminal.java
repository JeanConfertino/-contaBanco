import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {

        System.out.println("Seja bem vindo(a)!");
        System.out.println("Para te ajudar, utilize este exemplo de inserção de dados: ");

        System.out.println ("----------------------------------------");
        System.out.println ("Número: 1021");
        System.out.println ("Agência: 067-8");
        System.out.println ("Nome: MARIO ANDRADE");
        System.out.println ("Saldo: 237,48");
        System.out.println ("----------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Número da conta: ");
        int numeroDaConta = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a agência da conta: ");
        String agenciaDaConta = scanner.nextLine();
        System.out.print("Digite o seu Nome: ");
        String nomeDoCliente = scanner.nextLine();
        System.out.print("Digite o saldo atual: ");
        double saldoAtual = scanner.nextDouble();

        // Exiba o valor inserido pelo usuário
        System.out.println ("----------------------------------------");
        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaDaConta + ", conta " + numeroDaConta + " e seu saldo " + saldoAtual + " já está disponível para saque");
        System.out.println ("----------------------------------------");
        scanner.close();
    }
}