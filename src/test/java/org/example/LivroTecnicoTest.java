package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LivroTecnicoTest {

    private ILivro livro;

    @BeforeEach
    void setUp() {
        livro = new LivroTecnico();
    }

    @Test
    void deveRetornarNomeTecnico() {
        assertEquals("Tecnico", livro.getNome());
    }

    @Test
    void deveRetornarPreco35() {
        assertEquals(35.00, livro.getPreco(), 0.001);
    }

    @Test
    void deveRetornarMensagemDePreparo() {
        assertEquals("Livro tecnico preparado", livro.preparar());
    }
}
