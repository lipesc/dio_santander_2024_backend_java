public class Debbuging {
  public static void main(String[] args) {
    System.out.println("Inicio o programa no metodo main.");
    a();
    System.out.println("Fim do programa no metodo main.");
  }

   static void a() {
    System.out.println("Inicio o metodo a.");
    b();
    System.out.println("Fim do metodo a.");
  }

   static void b() {
    System.out.println("Inicio o metodo b.");
    for (int i = 0; i <= 4; i++)
      System.out.println("i = " + i);
    c();
    System.out.println("Fim do metodo b.");
  }
  static void c() {
    System.out.println("Inicio o metodo c.");
    // Thread.dumpStack();
    System.out.println("Fim do metodo c.");
  }
}
