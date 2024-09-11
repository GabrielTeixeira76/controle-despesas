package src.controller;

import src.model.TipoDespesa;
import src.utils.ArquivoUtil;
import java.util.List;
import java.util.ArrayList;

/**
 * Controlador responsável pela gestão dos tipos de despesa.
 */
public class TipoDespesaController {
    private List<TipoDespesa> tiposDespesa = new ArrayList<>();
    private static final String ARQUIVO_TIPOS_DESPESA = "tipos_despesa.txt";

    /**
     * Adiciona um novo tipo de despesa à lista e salva a atualização no arquivo.
     *
     * @param tipoDespesa O tipo de despesa a ser adicionado.
     */
    public void adicionarTipoDespesa(TipoDespesa tipoDespesa) {
        tiposDespesa.add(tipoDespesa);
        ArquivoUtil.salvarTiposDespesa(tiposDespesa, ARQUIVO_TIPOS_DESPESA);
    }

    /**
     * Exibe todos os tipos de despesa armazenados, carregando-os do arquivo.
     */
    public void listarTiposDespesa() {
        tiposDespesa = ArquivoUtil.carregarTiposDespesa(ARQUIVO_TIPOS_DESPESA);
        if (tiposDespesa.isEmpty()) {
            System.out.println("Nenhum tipo de despesa cadastrado.");
        } else {
            System.out.println("Tipos de despesa cadastrados:");
            for (TipoDespesa tipo : tiposDespesa) {
                System.out.println(tipo.getNome());
            }
        }
    }
}
