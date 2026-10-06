package org.example;

public class FabricaKitPresente implements FabricaAbstrata {
    public Embalagem criarEmbalagem() {
        return new EmbalagemPresente();
    }

    public Marcador criarMarcador() {
        return new MarcadorMetalico();
    }
}
