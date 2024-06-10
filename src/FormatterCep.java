public class FormatterCep {
  public static void main(String[] args) {
    try {
      String cepFormato = formataCep("02045070");

      System.out.println(cepFormato);
    } catch (CriandoExcecao e) {
      e.printStackTrace();  // imprime a pilha de erros

      System.out.println("Cep invalido");
    }
  }

  static String formataCep(String cep) throws CriandoExcecao {
    if (cep.length() != 8)  // 8 digitos
      throw new CriandoExcecao();


      return "" + cep.substring(0,  5) + "-" + cep.substring(5, 8);
    
  }
}