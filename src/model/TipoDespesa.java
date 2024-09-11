package src.model;

/**
 * Representa um tipo de despesa no sistema.
 */
public class TipoDespesa {
    private String nome;

    // Construtor padrão
    public TipoDespesa() {}

    // Construtor sobrecarregado
    public TipoDespesa(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}
