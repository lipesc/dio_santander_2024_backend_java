import java.util.Scanner;

public class Contador {
  /**
   * This method is the entry point of the program. It prompts the user to enter
   * two parameters,
   * then calls the `contar` method with the provided parameters. If the second
   * parameter is not
   * greater than the first, a `ParametrosInvalidosException` is thrown and the
   * error message is
   * printed.
   *
   * @param args the command-line arguments
   */
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);

    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = terminal.nextInt();
    System.out.println("Digite o segundo parâmetro");
    int parametroDois = terminal.nextInt();

    terminal.close();

    try {
      // chamando o método contendo a lógica de contagem
      contar(parametroUm, parametroDois);

    } catch (ParametrosInvalidosException e) {
      // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
      System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }

  }

  /**
   * Counts the number of iterations between two given parameters and prints the
   * count and the numbers between them.
   *
   * @param parametroUm   the first parameter
   * @param parametroDois the second parameter
   * @throws ParametrosInvalidosException if the first parameter is greater than
   *                                      the second parameter
   */
  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    if (parametroUm > parametroDois) {
      throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor ou igual ao segundo parâmetro");
    }

    // lógica de contagem
    int contagem = parametroDois - parametroUm;

    // lógica de impressão
    System.out.println("Numero de interrupções: " + contagem);
    for (int numero = parametroUm; numero <= parametroDois; numero++) {
      System.out.println("Imprimindo o número " + numero);
    }

  }
}
