import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    // todo: Conhecer e implementar as classe Scanner

    // exibir as mensagem para o usuario

    // obter pelo Scanner os dados do usuario

    // Exibir a mensagem conta criada
    Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

    int numero;
    String agencia;
    String nomeCliente;
    double saldo = 2050.50;

    System.out.println("Por favor, digite o número da conta! ");
    numero = scanner.nextInt();
    scanner.nextLine();// pula a quebra de linha

    System.out.println("Digite a agencia! ");
    agencia = scanner.nextLine();

    System.out.println("Digite o seu Nome! ");
    nomeCliente = scanner.nextLine();
    scanner.close();

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
  }
}
