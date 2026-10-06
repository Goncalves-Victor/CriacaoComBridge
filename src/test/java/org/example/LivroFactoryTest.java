package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class LivroFactoryTest {

    @Test
    void deveCriarLivroRomance() {
        assertEquals("Romance", LivroFactory.obterLivro("Romance").getNome());
    }

    @Test
    void deveCriarLivroTecnico() {
        assertEquals("Tecnico", LivroFactory.obterLivro("Tecnico").getNome());
    }

    @Test
    void deveLancarExcecaoParaGeneroInexistente() {
        assertThrows(IllegalArgumentException.class, () -> LivroFactory.obterLivro("Biografia"));
    }

    @Test
    void deveLancarExcecaoParaGeneroComLetraMinuscula() {
        assertThrows(IllegalArgumentException.class, () -> LivroFactory.obterLivro("romance"));
    }

    @Test
    void deveLancarExcecaoParaGeneroVazio() {
        assertThrows(IllegalArgumentException.class, () -> LivroFactory.obterLivro(""));
    }

    @Test
    void deveLancarExcecaoParaGeneroNulo() {
        assertThrows(IllegalArgumentException.class, () -> LivroFactory.obterLivro(null));
    }

    @Test
    void deveLancarExcecaoParaClasseQueNaoEhLivro() {
        // "org.example.LivroFactory" existe, mas nao implementa ILivro
        assertThrows(IllegalArgumentException.class, () -> LivroFactory.obterLivro("Factory"));
    }
}
