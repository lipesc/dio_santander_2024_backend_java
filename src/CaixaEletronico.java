public class CaixaEletronico {
  public static void main(String[] args) {

    double saldo = 25.0;
    double valorSaque = 26.0;

    if (valorSaque < saldo) {
      saldo = saldo - valorSaque;
      System.out.println("Novo saldo: R$" + saldo);
    } else
      System.out.println("Saldo insuficiente");

  }
}
