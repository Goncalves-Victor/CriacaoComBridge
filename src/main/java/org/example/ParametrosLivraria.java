package org.example;

public class ParametrosLivraria {

    private ParametrosLivraria() {};
    private static ParametrosLivraria instance = new ParametrosLivraria();
    public static ParametrosLivraria getInstance() {
        return instance;
    }

    private String nomeLivraria;
    private double taxaServico;
    private double taxaEntrega;

    public String getNomeLivraria() {
        return nomeLivraria;
    }

    public void setNomeLivraria(String nomeLivraria) {
        this.nomeLivraria = nomeLivraria;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }
}
