public class Main {
    public static void main(String[] args) {
        
        ObservadorEstoque compras = new Compras();
        ObservadorEstoque vendas = new Vendas();
        ObservadorEstoque auditoria = new Auditoria();

        Produto monitor = new Produto("Monitor Ultrawide", 10);

        monitor.adicionarObservador(compras);
        monitor.adicionarObservador(vendas);
        monitor.adicionarObservador(auditoria);

        System.out.println("--- 1. Reduzindo estoque para 4 (Dispara Auditoria e Compras) ---");
        monitor.setQuantidade(4);

        System.out.println("\n--- 2. ZERANDO o estoque (Dispara Auditoria e Compras) ---");
        monitor.setQuantidade(0);

        System.out.println("\n--- 3. Tentativa de setar 0 novamente (Nenhuma área deve ser notificada) ---");
        monitor.setQuantidade(0);

        System.out.println("\n--- 4. Repondo estoque para 15 (Dispara Auditoria e Vendas) ---");
        monitor.setQuantidade(15);

        System.out.println("\n--- 5. Removendo a área de Auditoria ---");
        monitor.removerObservador(auditoria);

        System.out.println("\n--- 6. Reduzindo estoque para 2 (Dispara APENAS Compras, pois Auditoria foi removida) ---");
        monitor.setQuantidade(2);
    }
}