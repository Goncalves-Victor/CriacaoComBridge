package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmbalagemProtetoraTest {

    @Test
    void deveRetornarDescricaoProtetora() {
        Embalagem embalagem = new EmbalagemProtetora();
        assertEquals("Embalagem protetora", embalagem.getDescricao());
    }

    @Test
    void deveRetornarPreco6() {
        Embalagem embalagem = new EmbalagemProtetora();
        assertEquals(6.00, embalagem.getPreco(), 0.001);
    }
}
