package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FabricaKitEstudoTest {


    @Test
    void deveCriarEmbalagemProtetora() {
        FabricaAbstrata fabrica = new FabricaKitEstudo();
        assertEquals("Embalagem protetora", fabrica.criarEmbalagem().getDescricao());
    }

    @Test
    void deveCriarMarcadorPapel() {
        FabricaAbstrata fabrica = new FabricaKitEstudo();
        assertEquals("Papel", fabrica.criarMarcador().getDescricao());
    }
}
