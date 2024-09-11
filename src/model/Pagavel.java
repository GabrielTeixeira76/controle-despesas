package src.model;

/**
 * Interface que define o contrato para classes que podem ser pagas.
 */
public interface Pagavel {
    void anotarPagamento(double valor, String dataPagamento);
}
