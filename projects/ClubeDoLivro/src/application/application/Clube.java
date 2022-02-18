package application;

import entities.Livro;
import entities.Ranking;
import entities.Pessoa;

public class Clube {

    public void Menu(){
        System.out.println("bem vindo ao menu");
    }

    public static void main(String[] args) throws Exception {
        
        Livro livro = new Livro("livro", 1989, "Joquin phoenix", 2000.0);

        Pessoa membro = new Pessoa("Silva", 16, 34689, 2, 7);


    }
}
