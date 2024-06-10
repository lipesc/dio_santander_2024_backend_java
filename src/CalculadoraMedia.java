import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraMedia {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String alunos[] = { "Felipe", "Di", "Joaquim", "Cleber" };

    double media = CalculadoraMediaTurma(alunos, scanner);

    System.out.printf("Media da turma:  %.1f", media);
    scanner.close();

  }
/**
 * Calculates the average grade of a class.
 *
 * @param alunos   an array of student names
 * @param scanner  a Scanner object to read input
 * @return         the average grade of the class
 * @throws InputMismatchException if the input is not a valid double
 */
  static double CalculadoraMediaTurma(String[] alunos, Scanner scanner) {
    try {
      double soma = 0.0;
      for (String aluno : alunos) {
        System.out.printf("Media do aluno: %s ", aluno);
        double nota = scanner.nextDouble();
        soma += nota;
      }
      return soma / alunos.length;
    } catch (InputMismatchException e) {
      System.out.println("Entrada invalida");
      scanner.next();
      return CalculadoraMediaTurma(alunos, scanner);
    }

  }
}
