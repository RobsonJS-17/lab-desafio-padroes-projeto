package one.digitalinnovation.gof.servico2;

public class TabelaProdutos {
    private static TabelaProdutos produtos = new TabelaProdutos();

    private TabelaProdutos(){
        super();
    }
    public static TabelaProdutos getInstance(){
        return produtos;
    }
    public String ExibeDescricaoProduto(String descricao){
        return "Valvula escape";
    }
    public int ExibeCodigoProduto(int codigo){
        return 1234;
    }
    public double ExibePrecoProduto(double preco){
        return 4.50;
    }
}
