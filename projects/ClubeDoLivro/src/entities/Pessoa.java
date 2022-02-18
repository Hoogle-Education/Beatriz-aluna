package entities;

import entities.Ranking;

public class Pessoa {
  private String nome;
  private int idade;
  private int cadastro;
  private int quantidadeAlugados;
  private int quantidadeComprados;
  private Ranking rank;

  Livro[] livrosComprados;
  Livro[] livrosAlugados;
  
  public Pessoa(String nome, int idade, int cadastro, int quantidadeAlugados, int quantidadeComprados) {
    this.nome = nome;
    this.idade = idade;
    this.cadastro = cadastro;
    this.quantidadeAlugados = quantidadeAlugados;
    this.quantidadeComprados = quantidadeComprados;
    this.rank = Ranking.NOOB;
    this.livrosComprados = new Livro[quantidadeComprados];
    this.livrosAlugados = new Livro [quantidadeAlugados];
  }

  

}
