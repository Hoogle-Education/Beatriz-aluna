# Privacidade de código

Precisamos proteger as variáveis dos objetos depois de sua criação, e não somente na sua criação.

# Organização

## Organização por convenção de classes

```
  class MyClass {
    |> atributos
    |> construtores
    |> getters and setters
    |> métodos
    |> toString 
    |> equals
  } 
```

# Noçao mais global sobre classes

Relembrando das strings:
```java

  String a = "algo";
  String b = "outra coisa";

  if( a.equals(b) ) System.out.println("true");
```

# To String

A toString geralmente é usada para dar um feedback da classe.

na classe:
```java
    @Override
    public String toString() {
        return "Shape [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4=" + lado4 + "]";
    }
```

na main:
```java
   System.out.println(forma1);
```

## OVERRIDE - Keyword

Palavra chave para reescrever um método da classe main.

# Equals
`
## INSTANCEOF - keyword

Checa se um objeto é uma instância de uma classe.

```java
  Pessoa joao = new Pessoa("Joao da Silva", 12);
  if( joao instanceof Pessoa ) System.out.println("True");
```

## Aplicando

```java
public class MyClass {

  public int att1;
  public String att2;

  @Override
  public boolean equals(Object object){
    if(object instanceof MyClass){

    }else return false;
  }
  
}

```