import entities.Pessoa;

class Pessoa {
    // atributos
    private String nome;
    private int idade;

    // construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
    // métodos
    
    // toString
    public String toString() {
        return "Pessoa [idade=" + idade + ", nome=" + nome + "]";
    }

}

public class App3 {
    public static void main(String[] args) {

        Pessoa joao = new Pessoa("joao da silva", 12);
        
        System.out.println(joao);
    }
}
