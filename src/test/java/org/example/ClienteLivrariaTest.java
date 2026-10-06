package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteLivrariaTest {

    private static final double DELTA = 0.001;

    @BeforeEach
    void setUp() {
        ParametrosLivraria parametros = ParametrosLivraria.getInstance();
        parametros.setTaxaServico(0.10);
        parametros.setTaxaEntrega(5.00);
    }


    @Test
    void deveMontarResumoRomanceComKitPresente() {
        FabricaKitPresente kitPresente = new FabricaKitPresente();
        ClienteLivraria cliente = new ClienteLivraria("Romance", kitPresente);
        assertEquals("Romance, Presente e Metalico", cliente.obterResumo());
    }

    @Test
    void deveMontarResumoTecnicoComKitPresente() {
        FabricaKitPresente kitPresente = new FabricaKitPresente();
        ClienteLivraria cliente = new ClienteLivraria("Tecnico", kitPresente);
        assertEquals("Tecnico, Presente e Metalico", cliente.obterResumo());
    }

    @Test
    void deveMontarResumoRomanceComKitEstudo() {
        FabricaKitEstudo kitEstudo = new FabricaKitEstudo();
        ClienteLivraria cliente = new ClienteLivraria("Romance", kitEstudo);
        assertEquals("Romance, Embalagem protetora e Papel", cliente.obterResumo());
    }

    @Test
    void deveMontarResumoTecnicoComKitEstudo() {
        FabricaKitEstudo kitEstudo = new FabricaKitEstudo();
        ClienteLivraria cliente = new ClienteLivraria("Tecnico", kitEstudo);
        assertEquals("Tecnico, Embalagem protetora e Papel", cliente.obterResumo());
    }


    @Test
    void deveSomarItensDeRomanceComKitPresente() {
        FabricaKitPresente kitPresente = new FabricaKitPresente();
        ClienteLivraria cliente = new ClienteLivraria("Romance", kitPresente);
        assertEquals(67.00, cliente.obterValorItens(), DELTA); // 40 + 12 + 15
    }

    @Test
    void deveSomarItensDeTecnicoComKitPresente() {
        FabricaKitPresente kitPresente = new FabricaKitPresente();
        ClienteLivraria cliente = new ClienteLivraria("Tecnico", kitPresente);
        assertEquals(62.00, cliente.obterValorItens(), DELTA); // 35 + 12 + 15
    }

    @Test
    void deveSomarItensDeRomanceComKitEstudo() {
        FabricaKitEstudo kitEstudo = new FabricaKitEstudo();
        ClienteLivraria cliente = new ClienteLivraria("Romance", kitEstudo);
        assertEquals(54.00, cliente.obterValorItens(), DELTA); // 40 + 6 + 8
    }

    @Test
    void deveSomarItensDeTecnicoComKitEstudo() {
        FabricaKitEstudo kitEstudo = new FabricaKitEstudo();
        ClienteLivraria cliente = new ClienteLivraria("Tecnico", kitEstudo);
        assertEquals(49.00, cliente.obterValorItens(), DELTA); // 35 + 6 + 8
    }

    @Test
    void deveFecharPedidoDeBalcaoComPix() {
        FabricaKitPresente kitPresente = new FabricaKitPresente();
        ClienteLivraria cliente = new ClienteLivraria("Romance", kitPresente);
        assertEquals(73.70, cliente.fecharPedido(new PedidoBalcao(new Pix())), DELTA);
    }

    @Test
    void deveFecharPedidoDeBalcaoComCartao() {
        FabricaKitPresente kitPresente = new FabricaKitPresente();
        ClienteLivraria cliente = new ClienteLivraria("Romance", kitPresente);
        assertEquals(77.385, cliente.fecharPedido(new PedidoBalcao(new Cartao())), DELTA);
    }

    @Test
    void deveFecharPedidoDeDeliveryComPix() {
        FabricaKitEstudo kitEstudo = new FabricaKitEstudo();
        ClienteLivraria cliente = new ClienteLivraria("Tecnico", kitEstudo);
        assertEquals(54.00, cliente.fecharPedido(new PedidoDelivery(new Pix())), DELTA);
    }

    @Test
    void deveFecharPedidoDeDeliveryComVoucher() {
        FabricaKitPresente kitPresente = new FabricaKitPresente();
        ClienteLivraria cliente = new ClienteLivraria("Romance", kitPresente);
        assertEquals(77.76, cliente.fecharPedido(new PedidoDelivery(new Voucher())), DELTA);
    }
}
