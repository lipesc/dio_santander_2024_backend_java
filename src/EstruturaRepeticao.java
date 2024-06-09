import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class EstruturaRepeticao {
  public static void main(String[] args) {

    // for(int carneirinhos = 1; carneirinhos <=20; carneirinhos++){
    // System.out.println("Carneirinho " + carneirinhos);
    // }

    // String aluno[] = { "Felipe", "Di", "Joaquim", "Cleber" };
    // for (int x = 0; x < aluno.length; x++) {
    // System.out.println("o aluno no indice x=" + x + " é " + aluno[x]);
    // }

    // for (String alunos : aluno) {
    // System.out.println("o aluno é " + alunos);

    // }

    // for (int numero = 1; numero <= 100; numero++) {
    // if (numero % 2 != 0)
    // continue; // pula para o proximo ou brake para parar
    // System.out.println("numeros impares = " + numero);

    // }

    // double mesada = 50.0;
    // while (mesada > 0) {
    // Double valorDoce = valorAleatorio();
    // if (valorDoce > mesada)
    // valorDoce = mesada;

    // System.out.printf("Mesada R$ %.2f\n valor do doce R$ %.2f\n", mesada,
    // valorDoce);
    // System.out.println();
    // mesada -= valorDoce;
    // }
    // System.out.printf("valor da mesada R$ %.2f\n ", mesada);
    // System.out.println("vc gastou toda a sua mesada!!");

    System.out.println("Discando... ");
    do {
      System.out.println(" Telefone ligando...");
    } while (tocando());
    System.out.println("Alô !!! ");

  }

  private static boolean tocando() {
    boolean atendeu = new Random().nextInt(5) == 1;
    // System.out.println("Atendeu? " + atendeu);
    return !atendeu;
  }
  // private static double valorAleatorio() {
  // return ThreadLocalRandom.current().nextDouble(2, 8);
  // }
}
