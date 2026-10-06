package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MarcadorPapelTest {

    private Marcador marcador;

    @BeforeEach
    void setUp() {
        marcador = new MarcadorPapel();
    }

    @Test
    void deveRetornarDescricaoPapel() {
        assertEquals("Papel", marcador.getDescricao());
    }

    @Test
    void deveRetornarPreco8() {
        assertEquals(8.00, marcador.getPreco(), 0.001);
    }
}
