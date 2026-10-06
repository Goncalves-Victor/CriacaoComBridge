package org.example;

public class LivroRomance implements ILivro {

    public String getNome() {
        return "Romance";
    }

    public double getPreco() {
        return 40.00;
    }

    public String preparar() {
        return "Livro de romance preparado";
    }
}
