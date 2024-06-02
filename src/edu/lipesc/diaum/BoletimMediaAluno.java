package edu.lipesc.diaum;

import java.util.Scanner;

public class BoletimMediaAluno {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a nota: ");

    int n = scanner.nextInt();

    if (n < 6) {
      System.out.println("Reprovado");
    } else if (n == 6) {
      System.out.println("Pre aprovado");
    } else
      System.out.println("Aprovado");

    scanner.close();
  }
}
