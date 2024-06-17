public class Cosmetico extends Loja {
    private double taxaComercializacao;
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantMaxProdutos, double taxaComercializacao){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao){
        this. taxaComercializacao = taxaComercializacao;
    }

    @Override

    public String toString(){
        return  "\nNome: " + getNome() +
                "\nQuantidade de funcionários: " + getQuantidadeFuncionarios() +
                "\nSalário base dos funcionários: R$ " + String.format("%.2f", getSalarioBaseFuncionario()) +
                "\nGastos com salário: R$ " + String.format("%.2f", gastosComSalario()) +
                "\nTamanho da loja:" + tamanhoDaLoja() +
                "\n" + getEndereco() +
                "\nData de fundação: " + getDataFundacao() +
                "\nQuantidade máxima de produtos disponível:" + getQuantMaxProduto() +
                "\nTaxa de comercialização: R$ " + String.format("%.2f", taxaComercializacao);
    }
}
