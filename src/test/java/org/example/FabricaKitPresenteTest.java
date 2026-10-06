package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FabricaKitPresenteTest {

    @Test
    void deveCriarEmbalagemPresente() {
        FabricaAbstrata fabrica = new FabricaKitPresente();
        assertEquals("Presente", fabrica.criarEmbalagem().getDescricao());
    }

    @Test
    void deveCriarMarcadorMetalico() {
        FabricaAbstrata fabrica = new FabricaKitPresente();
        assertEquals("Metalico", fabrica.criarMarcador().getDescricao());
    }
}
