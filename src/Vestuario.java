
public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados,int quantMaxProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
        this.produtosImportados = produtosImportados;
//
    }

    public boolean getProdutosImportados(){
        return  produtosImportados;
    }
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override

    public String toString(){
        return  "\nNome: " + getNome() +
                "\nQuantidade de funcionários: " + getQuantidadeFuncionarios() +
                "\nSalário base dos funcionários: R$ " + String.format("%.2f", getSalarioBaseFuncionario()) +
                "\nGastos com salário: R$ " + String.format("%.2f", gastosComSalario()) +
                "\nTamanho da loja: " + tamanhoDaLoja() +
                "\n" + getEndereco() +
                "\nData de fundação: " + getDataFundacao() +
                "\nQuantidade máxima de produtos disponível:" + getQuantMaxProduto() +
                "\n Vende roupas importadas?" + (produtosImportados ? "Sim" : "Não");
    }
}
