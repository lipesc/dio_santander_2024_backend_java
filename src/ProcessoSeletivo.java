import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    // analisarCandidato(2200.0);
    // analisarCandidato(1900.0);
    // analisarCandidato(2000.0);
    // selecaoCandidatos();
    // imprimirCandidatos();
    String candidatos[] = { "Felipe", "banban", "Joaquim", "Cleber", "Pedro" };
    for (String candidato : candidatos) {
      entrandoEmContato(candidato);
    }
  }

  static void entrandoEmContato(String candidato) {
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;
    do {
      atendeu = atender();
      continuarTentando = !atendeu;
      if (continuarTentando)
        tentativasRealizadas++;
      else
        System.out.println("contato com sucesso.\n");
    } while (continuarTentando && tentativasRealizadas < 3);
    if (atendeu) {
      System.out
          .println("conseguimos contato com o candidato " + candidato + " na " + tentativasRealizadas + " tentativa\n");
    } else {
      System.out.println("nao conseguimos contato com o candidato " + candidato + ", numero maximo de tentativas  "
          + tentativasRealizadas + " realizadas\n");
    }
  }

  // metodo auxiliar
  static boolean atender() {
    return new Random().nextInt(3) == 1;
  }

  static void imprimirCandidatos() {
    String candidatos[] = { "Felipe", "banban", "Joaquim", "Cleber", "Pedro" };
    System.out.println("Imprimindo os candidatos");
    for (int indice = 0; indice < candidatos.length; indice++) {
      System.out.println("canditado numero º" + (indice + 1) + " e o nome é " + candidatos[indice]);
    }
  }

  static void selecaoCandidatos() {
    String candidatos[] = { "Felipe", "banban", "Joaquim", "Cleber", "Pedro", "Lucas", "atum", "Rafael", "Vitor",
        "vinicius" };

    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;
    while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("O candidato " + candidato + " Solicitou esse valor de salario: " + salarioPretendido);
      if (salarioBase >= salarioPretendido) {
        System.out.println("O candidato " + candidato + " foi selecionado para vaga");
        candidatosSelecionados++;
      }
      candidatoAtual++;
    }
  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido)
      System.out.println("Ligar para o candidato");
    else if (salarioBase == salarioPretendido) {
      System.out.println("ligar com contra proposta");
    } else {
      System.out.println("aguardando demais candidatos");
    }
  }

}
