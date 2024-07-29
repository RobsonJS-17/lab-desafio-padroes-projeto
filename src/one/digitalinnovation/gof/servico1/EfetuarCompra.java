package one.digitalinnovation.gof.servico1;

public class EfetuarCompra {
    private EfetuarCompra() {
        super();
    }

    public static void CompraEfetuada(int codigo, String descricao, double preco){
        System.out.println("Compra Efetuada");
        System.out.println(codigo);
        System.out.println(descricao);
        System.out.println(preco);
    }
}
