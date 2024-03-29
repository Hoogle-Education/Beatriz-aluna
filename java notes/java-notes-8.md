# Tratamento de Excessões (`try-catch`)

O objetivo é manter um fluxo de dados durante o programa/sistema, sem que um erro seja capaz de interromper todo o código.

sintaxe:
```java
  try {
    // código a ser testado
  } catch(Exepcetion e){
    System.err.println(e.getMessage());
  }
```

O bloco `try` executa o código e caso uma excessão seja capturada, o bloco `catch` passa a ser executado.

Exemplo:

```java

try{
  // código a ser testado
}catch(ImputMismatchException imex){
  // se achei algum tipo de input incompatível
}catch(IOException iox){
  // se achei algum tipo de entrada ou saída com falha
}

```

## Keyword `finally`

Todo conteúdo da `finally` será **sempre** executado ao fim de um bloco `try-catch`.
 
sintaxe:
```java
  try{
    // código a ser testado
  }catch(Exception e){
    // se achei alguma excessão
  } finally {
    // bloco a sempre ser executado.
  }
```

## Métodos usuais

Supondo um objeto `exception` da excessão que você está tratando, é normal que se use:

1. `exception.printStackTrace()`: Imprime o rastro até o ponto em que a excessão é obtida, em programas com diversos métodos é útil pois indica muito bem não somente a origem, mas o caminho do erro.

2. `exception.getMessage()`: Basicamente pega a mensagem do erro padrão, ou uma possível mensagem personalidada associada a algum erro.

# Postergar ou produzir excessões

## 1. `throw`

```java
try{
  int a = 2; // criada e esquecida

  obj.setNota(11.0);b// 
  // interrompe o try
  throw new IOXException("Erro na entrada"); 
  
  int b = 3; // nem é criada
}catch(IOException iox){
  System.out.println(iox.getMessage());
}
```


## 2. `throws`

## 3. Exemplo:

Método que registra a nota de um aluno.

```java
  void setNota(double nota) throws InputMissmatchException {
      if(nota > 10) 
      throw new InputMissmatchException("Nota acima do esperado");

      this.nota = nota;
  }
```

# Excessões Personalizadas