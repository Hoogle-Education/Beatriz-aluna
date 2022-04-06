package application;

import java.io.IOException;

import entities.Aluno;

public class Program {
  
  public static void main(String[] args) {
    
    Aluno joao = new Aluno("Joao");

    try{
      System.out.println("I'm running on try :)");
      joao.setNota(-2.0);
    }catch(IOException iox){
      System.out.println(iox.getMessage());
    }

    System.out.println("terminou de boa");

  }

}
