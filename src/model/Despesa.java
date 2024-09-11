package src.model;

import java.time.LocalDate;

/**
 * Representa uma despesa no sistema.
 */
public class Despesa {
    private String descricao;
    private double valor;
    private LocalDate dataVencimento;
    private TipoDespesa tipoDespesa;
    private boolean paga;

    // Construtor padrão
    public Despesa() {
    }

    // Construtor com parâmetros
    public Despesa(String descricao, double valor, LocalDate dataVencimento, TipoDespesa tipoDespesa) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.tipoDespesa = tipoDespesa;
        this.paga = false; // A despesa não está paga por padrão
    }

    // Métodos para obter e definir a descrição
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Métodos para obter e definir o valor
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Métodos para obter e definir a data de vencimento
    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    // Métodos para obter e definir o tipo de despesa
    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(TipoDespesa tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    // Métodos para verificar e definir o status de pagamento
    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }
}
