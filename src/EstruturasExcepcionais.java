import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class EstruturasExcepcionais {
  public static void main(String[] args) {
    // try {
    // Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

    // System.out.println(" Digite seu nome: ");
    // String nome = scanner.nextLine();

    // System.out.println("sobrenome: ");
    // String sobrenome = scanner.nextLine();

    // System.out.println(" Digite sua idade: ");
    // int idade = scanner.nextInt();

    // System.out.println(" Digite sua altura: ");
    // double altura = scanner.nextDouble();

    // // imprimir os dados digitados
    // System.out.println("Ola, me chamo " + nome.toUpperCase() + " " +
    // sobrenome.toUpperCase());
    // System.out.println("Tenho " + idade + " anos e minha altura e de " + altura +
    // " metros");
    // scanner.close();

    // } catch (InputMismatchException e) {
    // System.out.println("**Finalizado.\n Informar os campos idade e altura com
    // numeros e ponto não virgula**");
    // }

    // Exemplo exceção
    Number valor;
    try {

      valor = NumberFormat.getInstance().parse("a1.75");
      System.out.println(valor);

    } catch (ParseException e) {

      e.printStackTrace();

    }

  }
}
