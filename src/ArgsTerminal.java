import java.util.Scanner;
import java.util.Locale;
public class ArgsTerminal {
  public static void main(String[] args) {

    // String name = args[0];
    // String sobrenome = args[1];
    // int idade = Integer.valueOf(args[2]);
    // double altura = Double.valueOf(args[3]);

    Scanner scanner = new Scanner(System.in).useLocale( Locale.ENGLISH );
    String name = scanner.nextLine();

    String sobrenome = scanner.nextLine();

    int idade = scanner.nextInt();
    scanner.nextLine();// pule a quebra de linha

    double altura = scanner.nextDouble();

    System.out.println("ola meu é nome é " + name + " " + sobrenome);
    System.out.println("tenho " + idade + " anos ");
    System.out.println("Minha altura é " + altura + " cm ");
    scanner.close();// fecha o scanner para liberar recursos

  }
  
}
