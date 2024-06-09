public class PlanoOperadora {
  public static void main(String[] args) {
    /*
     * REQUISITO : IMPLEMENTAR
     * o sistema tera 03 planos: BASIC, MIDIA, TURBO
     * BASIC : 100 minutos de ligacao
     * Midia : 100 minutos de ligacao + WhatsApp e instagram gratis
     * Turbo : 100 minutos de ligacao + WhatsApp e instagram gratis + 5G Youtube
     */
    String plano = "B";

    switch (plano) {
      case "T": {
        System.out.println("5G Youtube");
      }
      case "M": {
        System.out.println("WhatsApp e instagram gratis");
      }
      case "B": {
        System.out.println("100 minutos de ligacao");
      }
    }
    
    // if (plano == "B") {
    // System.out.println("100 minutos de ligacao");
    // } else if (plano == "M") {
    // System.out.println("100 minutos de ligacao + WhatsApp e instagram gratis");
    // } else if (plano == "T") {
    // System.out.println("100 minutos de ligacao + WhatsApp e instagram gratis + 5G
    // Youtube");
    // } else {
    // System.out.println("Plano inexistente");
    // }
  }
}
