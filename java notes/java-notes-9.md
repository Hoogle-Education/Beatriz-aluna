# Manipulação de Arquivos - **`Scanner`**

A `Scanner` pode receber em seu construtor uma classe do tipo `File` e a classe `File` por sua vez recebe um **caminho absoluto** de um arquivo.

## Caminho absoluto x Caminho Relativo

O **caminho absoluto** precisa partir da raiz do computador. Geralmente parte da pasta `C:/` e assim sucessivamente até 
alcançarmos o projeto.

Arquivo txt na pasta temp absoluto:
```
  D:/temp/clientes1.txt
```

O **caminho relativo** ele referencia a pasta aberta em questão, tornando mais fácil o acesso a um arquivo local.

Acessando arquivo que está na mesma pasta por caminho relativo:
```
  clientes1.txt
```

## Abrindo arquivos com a **`Scanner`**

```java
  String absolutePath = " D:/temp/clientes1.txt"
  Scanner fileInput = new Scanner(new File(absolutePath));
```

## Lendo o arquivo

