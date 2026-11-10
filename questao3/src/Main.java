public class Main {
    public static void main(String[] args) {
        Bebida pedido1 = new Espresso();
        pedido1 = new Leite(pedido1);
        pedido1 = new Chantilly(pedido1);

        Bebida pedido2 = new Cha();
        pedido2 = new Calda(pedido2);

        Bebida pedido3 = new Espresso();
        pedido3 = new Leite(pedido3);
        pedido3 = new Leite(pedido3);
        pedido3 = new Calda(pedido3);

        System.out.println("Pedido 1 - Descrição: " + pedido1.getDescricao() + " | Preço Total: R$ " + pedido1.getPreco());
        System.out.println("Pedido 2 - Descrição: " + pedido2.getDescricao() + " | Preço Total: R$ " + pedido2.getPreco());
        System.out.println("Pedido 3 - Descrição: " + pedido3.getDescricao() + " | Preço Total: R$ " + pedido3.getPreco());
    }
}