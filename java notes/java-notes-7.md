# Classes Abstratas

Tem como objetivo servir de apoio para um herança, sem nunca ser efetivamente instanciada.

Estabelecem método que podem ser sobreescritos durante a herança.

```java
public abstract class Shape {

  public abstract Double area();

}
```

```java
public class Circle extends Shape {

  private static final Double PI = 3.14159265;
  private Double r;

  public Double area(){
    return r*r*PI;
  }

}
```

Toda interface como veremos também é uma classe abstrata.

## Exemplo genial que quase funciona

📦 `entities` > ➕`Invoice`:
```java
private Tax taxa;

public Invoice(Tax taxa){
  this.taxa = taxa;
}
```

📶 *Tax Class* enhitance:
```
  *Tax*
   | > BrasilTax
   | > USATax
```

📦`application` > ➕ `Program.java`:
```java
  Invoice order1 = new Invoice( new BrasilTax() );
  Invoice order2 = new Invoice( new USATax() );
```

### Porque não funciona ?

Porque a `Tax` é abstrata e não podemos criar o objeto `taxa`, consequentemente, isso não permitiria a instância dinâmica e o baixo acoplamento que vemos na classe `Program`.

# Interfaces

São classes abstratas, porém mais potentes, capazes de estabelecer contratos. Um contrato nada mais é que um método a ser resolvido/implementado por alguém.

## Keyword implements

📦 `entities.interfaces` > `Cobertura.java`
```java
public interface Cobertura {

  public void valorPeloSabor();

}
```

```java
public class Torta implements Cobertura {

  public Double raio;
  public static final valorPorArea = 1.50;
  public Double valor = 0;

  public Double total(){
    return valor = (raio*raio*3.14159265)*(valorPorArea);
  }

}
```

```java
public class DeLimao extends Torta {

  public void valorPeloSabor(){
    valor += 20.00;
  }

  @Override
  public Double total(){
    valorPeloSabor();
    return valor;
  }

}
```