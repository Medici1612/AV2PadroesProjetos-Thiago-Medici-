public class Auditoria implements ObservadorEstoque {
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        System.out.println("[AUDITORIA] Registro: O estoque do produto '" + nomeProduto + 
                           "' foi atualizado para " + novaQuantidade + " unidades.");
    }
}