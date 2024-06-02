public class ArgsTerminal {
  public static void main(String[] args) {

    String name = args[0];
    String sobrenome = args[1];
    int idade = Integer.valueOf(args[2]);
    double altura = Double.valueOf(args[3]);

    System.out.println("ola meu é nome é " + name + " " + sobrenome);
    System.out.println("tenho " + idade + " anos ");
    System.out.println("Minha altura é " + altura + " cm ");

  }
}
