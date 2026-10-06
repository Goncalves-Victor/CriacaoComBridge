package org.example;

public class FabricaKitEstudo implements FabricaAbstrata {
    public Embalagem criarEmbalagem() {
        return new EmbalagemProtetora();
    }

    public Marcador criarMarcador() {
        return new MarcadorPapel();
    }
}
