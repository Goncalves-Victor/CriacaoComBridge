package org.example;

public class ClienteLivraria {
    private ILivro livro;
    private Embalagem embalagem;
    private Marcador marcador;

    public ClienteLivraria(String genero, FabricaAbstrata kit) {
        this.livro = LivroFactory.obterLivro(genero);
        this.embalagem = kit.criarEmbalagem();
        this.marcador = kit.criarMarcador();
    }

    public String obterResumo() {
        return this.livro.getNome() + ", " + this.embalagem.getDescricao()
                + " e " + this.marcador.getDescricao();
    }

    public double obterValorItens() {
        return this.livro.getPreco() + this.embalagem.getPreco() + this.marcador.getPreco();
    }

    public double fecharPedido(Pedido pedido) {
        return pedido.calcularTotal(obterValorItens());
    }
}
