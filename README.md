# tasks

# 1. Criar uma classe Aluno

Atributos:

 - Atributos:
 ```
  Nome: String,
  RA: Integer,
  idade: Integer,
  notaProva1: Double,
  notaProva2: Double,
  mediaFinal: Double, default = 0.0
  status: String, default = null
 ``` 

  não esqueça dos construtores e getters e setters

 -métodos:
 ```
  - calculaMedia() : Double 
  - resultadoBoletim(): String
  - fazerRecuperacao(): Double
 ```

 calcula media atualiza a media, com base nas provas

 resultado Boletim coloca no status: Reprovado se a nota for menor que 4, recuperação se for menor que 7 e maior que 4 e Aprovado se for maior que 7

 se o aluno ficar de recuperacao, chame a o método para fazer recuperacao e atualize a media

# chamar o Programa Principal de Escola

 - Criar uma Lista de alunos

 - método para adicionar alunos

 - método para remover pelo RA

 - função principal