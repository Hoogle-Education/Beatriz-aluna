package entities;

import java.util.ArrayList;
import java.util.List;

import entities.Ranking;

public class Pessoa {
  private String nome;
  private int idade;
  private int cadastro;
  private int quantidadeAlugados;
  private int quantidadeComprados;
  private Ranking rank;

  List <Livro> livrosComprados;
  List <Livro> livrosAlugados;

    
  public Pessoa(String nome, int idade, int cadastro) {
    this.nome = nome;
    this.idade = idade;
    this.cadastro = cadastro;
    this.quantidadeAlugados = 0;
    this.quantidadeComprados = 0;
    this.rank = Ranking.NOOB;
    livrosComprados = new ArrayList<Livro>();
    livrosAlugados = new ArrayList<Livro>();
  }
  
  public Pessoa(String nome, int idade, int cadastro, int quantidadeAlugados, int quantidadeComprados) {
    this.nome = nome;
    this.idade = idade;
    this.cadastro = cadastro;
    this.quantidadeAlugados = quantidadeAlugados;
    this.quantidadeComprados = quantidadeComprados;
    this.rank = Ranking.NOOB;
    livrosComprados = new ArrayList<Livro>();
    livrosAlugados = new ArrayList<Livro>();
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public int getCadastro() {
    return cadastro;
  }

  public int getQuantidadeAlugados() {
    return quantidadeAlugados;
  }

  public int getQuantidadeComprados() {
    return quantidadeComprados;
  }

  public Ranking getRank() {
    return rank;
  }

  public List<Livro> getLivrosComprados() {
    return livrosComprados;
  }

  public List<Livro> getLivrosAlugados() {
    return livrosAlugados;
  }
  
  public void levelUp(){
    switch (rank){
      case NOOB:
        rank = Ranking.STARTER;
        break;
      case STARTER:
        rank = Ranking.AVERAGE;
        break;
      case AVERAGE:
        rank = Ranking.ADVANCED;
        break;
      case ADVANCED:
        rank = Ranking.MASTER;
        break;
      case MASTER:
        System.out.println("Congratulations! you're a masterpiece");
        break;
    }
  }

  public void levelDown(){
    switch (rank){
      case NOOB:
        System.out.println("?????");
        break;
      case STARTER:
        rank = Ranking.NOOB;
        break;
      case AVERAGE:
        rank = Ranking.STARTER;
        break;
      case ADVANCED:
        rank = Ranking.AVERAGE;
        break;
      case MASTER:
        rank = Ranking.ADVANCED;
        break;
    }
  }

  public void alugaLivro(Object object){
    if(object instanceof Livro){

      livrosAlugados.add( (Livro)object );
      System.out.println("Livro alugado!");
    } else {
      System.out.println("Nao foi possivel adicionar! Nao eh um livro.");
    }
  }

}
