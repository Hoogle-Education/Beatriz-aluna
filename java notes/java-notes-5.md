# Herança

```
  Shape
    |
    | - Triangle
    | - Circle
    | - Rectangle
         | - Square
```

# Pausa pra Enums

`enums` são tipos enumerados, basicamente uma lista de opções.

```java
public enum Color {
  BLUE,
  RED,
  GREEN,
  YELLOW,
  PURPLE;
}
```

## Voltando

Toda shape tem espessura e cor definida, e não é interessante redigitar esses atributos básicos de uma shape, quando estamos falando de outra coisa que também shape.


## Keyword `extends`

