package org.example;

public class LivroTecnico implements ILivro {

    public String getNome() {
        return "Tecnico";
    }

    public double getPreco() {
        return 35.00;
    }

    public String preparar() {
        return "Livro tecnico preparado";
    }
}
