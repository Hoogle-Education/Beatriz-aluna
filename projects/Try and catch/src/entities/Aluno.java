package entities;

import java.io.IOException;

public class Aluno {

  private String nome;
  private double nota;
  
  public Aluno(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getNota() {
    return nota;
  }

  public void setNota(double nota) throws IOException{
    
    if(nota > 10) throw new IOException("Nota passou o limite!");
    else if(nota < 0) throw new IOException("Nota abaixo do limite!");

    this.nota = nota;
  }

  @Override
  public String toString() {
    return "Aluno [nome=" + nome + ", nota=" + nota + "]";
  }
  
}
