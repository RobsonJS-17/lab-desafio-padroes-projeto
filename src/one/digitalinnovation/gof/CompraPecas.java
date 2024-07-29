package one.digitalinnovation.gof;

import one.digitalinnovation.gof.servico1.EfetuarCompra;
import one.digitalinnovation.gof.servico2.TabelaProdutos;

public class CompraPecas {
    public void comprarPecas(int codigo, String descricao){

        double preco = TabelaProdutos.getInstance().ExibePrecoProduto(codigo);
        EfetuarCompra.CompraEfetuada(codigo,descricao,preco);
}
}
