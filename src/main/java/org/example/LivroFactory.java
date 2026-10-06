package org.example;

public class LivroFactory {
    public static ILivro obterLivro(String livro) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Livro" + livro);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception | NoClassDefFoundError ex) {
            throw new IllegalArgumentException("Livro inexistente");
        }
        if (!(objeto instanceof ILivro)) {
            throw new IllegalArgumentException("Livro invalido");
        }
        return (ILivro) objeto;
    }
}
