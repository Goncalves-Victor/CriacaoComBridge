package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmbalagemPresenteTest {

    @Test
    void deveRetornarDescricaoPresente() {
        Embalagem embalagem = new EmbalagemPresente();
        assertEquals("Presente", embalagem.getDescricao());
    }

    @Test
    void deveRetornarPreco12() {
        Embalagem embalagem = new EmbalagemPresente();
        assertEquals(12.00, embalagem.getPreco(), 0.001);
    }
}
