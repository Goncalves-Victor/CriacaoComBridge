package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Modifier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParametrosLivrariaTest {

    private ParametrosLivraria parametros;

    @BeforeEach
    void setUp() {
        parametros = ParametrosLivraria.getInstance();
        parametros.setNomeLivraria("Livraria Teste");
        parametros.setTaxaServico(0.10);
        parametros.setTaxaEntrega(5.00);
    }

    @Test
    void deveRetornarSempreAMesmaInstancia() {
        assertSame(ParametrosLivraria.getInstance(), ParametrosLivraria.getInstance());
    }

    @Test
    void deveTerConstrutorPrivado() throws NoSuchMethodException {
        int modificadores = ParametrosLivraria.class.getDeclaredConstructor().getModifiers();
        assertTrue(Modifier.isPrivate(modificadores));
    }

    @Test
    void devePersistirNomeDaLivraria() {
        parametros.setNomeLivraria("Livraria do Ze");
        assertEquals("Livraria do Ze", parametros.getNomeLivraria());
    }

    @Test
    void devePersistirTaxaDeServico() {
        parametros.setTaxaServico(0.15);
        assertEquals(0.15, parametros.getTaxaServico(), 0.0001);
    }

    @Test
    void devePersistirTaxaDeEntrega() {
        parametros.setTaxaEntrega(9.90);
        assertEquals(9.90, parametros.getTaxaEntrega(), 0.0001);
    }

    @Test
    void deveCompartilharValoresEntreReferenciasDaInstancia() {
        parametros.setTaxaEntrega(7.50);
        assertEquals(7.50, ParametrosLivraria.getInstance().getTaxaEntrega(), 0.0001);
    }
}
