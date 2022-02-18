package entities;

public class Livro {
  
  // atributos
  private String nome;
  private int ano;
  private String autor;
  private double valorDeCompra;
  
  // construtores
  public Livro(String nome, int ano, String autor, double valor) {
    this.nome = nome;
    this.ano = ano;
    this.autor = autor;
    this.valor = valor;
  }
  // getters and setters
  public String getNome() {
    return nome;
  }

  public int getAno() {
    return ano;
  }

  public String getAutor() {
    return autor;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }
  
  // métodos
  
  // toString
  @Override
  public String toString() {
    return "Livro [ano=" + ano + ", autor=" + autor + ", nome=" + nome + ", valor=" + valor + "]";
  }
  
  // equals
  
}
