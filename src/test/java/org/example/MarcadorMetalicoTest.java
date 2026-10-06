package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MarcadorMetalicoTest {

    private Marcador marcador;

    @BeforeEach
    void setUp() {
        marcador = new MarcadorMetalico();
    }

    @Test
    void deveRetornarDescricaoMetalico() {
        assertEquals("Metalico", marcador.getDescricao());
    }

    @Test
    void deveRetornarPreco15() {
        assertEquals(15.00, marcador.getPreco(), 0.001);
    }
}
