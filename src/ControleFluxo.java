public class ControleFluxo {

  public static void main(String[] args) {

    int nota = 4;

    // if (nota >= 7) {
    //   System.out.println("Aprovado");
    // } else if (nota >= 5 && nota < 7) {
    //   System.out.printf("Recuperação : %d" , nota);
    // } else {
    //   System.out.println("Reprovado");

    // }

    String resultado = nota >= 7 ? "Aprov" : nota >= 5 && nota < 7 ? "recuperacao" : "reprovado";
    System.out.println(resultado);

  }
}
