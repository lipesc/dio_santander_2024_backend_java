package edu.lipesc.diaum;

public class Myclass {
  public static void main(String[] args) {

    String sobrenome = "Sampaio";
    String nome = "Fehh";

    String nomeCompleto = nomeCompleto(nome, sobrenome);

    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto(String nome, String sobrenome) {

    return "Resultado " + nome.concat(" \n").concat(sobrenome);

  }
}
