import java.util.HashMap;
import java.util.Map;

public class Vendas implements ObservadorEstoque {
    private Map<String, Integer> historicoEstoque = new HashMap<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        Integer estoqueAnterior = historicoEstoque.getOrDefault(nomeProduto, -1);
        
       
        if (estoqueAnterior != null && estoqueAnterior == 0 && novaQuantidade > 0) {
            System.out.println("[VENDAS] OBA! O produto '" + nomeProduto + 
                               "' voltou a ter estoque. Quantidade atual: " + novaQuantidade);
        }
        
        historicoEstoque.put(nomeProduto, novaQuantidade);
    }
}