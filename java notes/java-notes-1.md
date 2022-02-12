## Introdução a POO

## 1.Ideia inicial

Definir em 2 partes:
  atributos
  métodos

**Classe:** molde
**Objeto:** fruto do molde

### 2. Atributos

São especificidades das classes.

```java

  class Pessoa {

    // atributos
    String nome;
    int idade;

    // métodos


  }

  public static void main(String[] args){

    Pessoa joao = new Pessoa();

    joao.nome = "Joao da silva";
    joao.idade = 12;

  }

```

## 3. Métodos

São ações que uma objeto de uma classe pode tomar.

```java
 class Pessoa {

    // atributos
    String nome;
    int idade;

    // métodos
    public void aniversario(){
        idade++;
    }

  }
```

## 4. Constutores

São uma etapa para interferir na criação de um objeto. Por exemplo, não deveríamos criar uma pessoa sem nome, porém um telefone pode ser opicional.

```java
  
  class Pessoa {
    String nome;
    int idade;
    long telefone;

    public Pessoa(String nome, int idade){//quando criar um obj pessoa, vai ter que ter isso. 
      this.nome = nome;
      this.idade = idade;
    }
  }

  public class Application {
    public static void main(){
      Pessoa joao2 = new Pessoa("Joao da Silva", 12);
      Pessoa joao3 = new Pessoa("Joao da Silva", 12, 2171287102102);
    }
  }
  

```

### KEYWORD: **THIS**

faz referência ao atributo ou método da própria classe em questão. O principal uso é durante os construtores.

```java
class MyClass{

  public int attribute1;
  public double attribute2;
  public String attribute3;

  public MyClass(int attibute1, double attribute2, String attribute3){
    this.attibute1 = attibute1;
    this.attibute2 = attibute2;
    this.attibute3 = attibute3;
  }
}
```

### EXPRESSION: **OVERLOADING**

é o processo de sobrecarregar os construtores de uma classe e permitir a múltipla instanciação de uma mesma classe. (tirar objetos iguais do molde de várias formas diferentes)

### KEYWORD: **NEW**

Cria um objeto, baseado em seus construtores.

```java
  // ...

    MyClass object = new MyClass( /*attributes*/ );

  // ...
```