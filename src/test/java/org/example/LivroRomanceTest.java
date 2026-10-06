package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LivroRomanceTest {

    @Test
    void deveRetornarNomeRomance() {
        ILivro livro = new LivroRomance();
        assertEquals("Romance", livro.getNome());
    }

    @Test
    void deveRetornarPreco40() {
        ILivro livro = new LivroRomance();
        assertEquals(40.00, livro.getPreco(), 0.001);
    }

    @Test
    void deveRetornarMensagemDePreparo() {
        ILivro livro = new LivroRomance();
        assertEquals("Livro de romance preparado", livro.preparar());
    }
}
