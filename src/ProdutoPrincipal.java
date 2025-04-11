public class ProdutoPrincipal {
    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("Geladeira");
        produto.setPreco(1500);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: " + produto.getPreco());
        produto.aplicarDesconto(10);
        System.out.println("Novo Preço após Desconto: " + produto.getPreco());

    }
}
