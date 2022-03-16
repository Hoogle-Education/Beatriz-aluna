# Atributos e métodos estáticos

## Keyword `static`

Ela torna um atributo sendo *sempre o mesmo* indepente do objeto instanciado. Além disso, nem sequer é necessário instanciar um objeto para usar um método ou atributo estático.

não convém:
```java
  Math operation = new Math();

  operation.sqrt(a, b);
```

**muito melhor:**
```java
  Match.sqrt(a);
```

Exemplo:

📦 `entities` > `Circle.java`
```java
package entities;

public class Circle{

  public static final double PI = 3.14159265;

  public static double calculaArea(double radius){
    return PI*radius*radius;
  }

}
```

📦 `application` > `Circle.java`
```java
package application;

import entities.Circle;

public class Program{

  public static void main(String[] args){
    System.out.println(Circle.calculaArea(2.0));
  }

}

```

## Keyword `final`

`final` indica que é o estado final de uma variável ou de um método, logo não pode ser alterado ou sobreescrito.


## Keyword `instanceof`

Checa se um objeto é uma instância/pertence a uma determinada classe.


Exemplo: Durante a implementação da `.equals`
```java
  if(object instanceof Pessoa){
    // checo os outros atributos
  }else return false;
```

# Equals e HashCode

## 1. Equals

Compara *friamente* se dois objetos são iguais.

📦 `mypackage` > `MyClass.java`
```java
  public boolean equals(Object object){

    if( ! (object instanceof MyClass) ) return false;

    MyClass other = (MyClass)object;

    // comparo 1 a 1 - caso de pessoa
    return getNome().equals(other.getNome()) 
            && getIdade() == other.getIdade();
    
  }
```

📦 `application` > `Program.java`
```java
public class Program{

  public static void main(String[] args){

    Pessoa joao;
    Pessoa maria;

    joao.equals(maria);

  }
}
```
