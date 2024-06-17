public class Bijuteria extends Loja{
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int quantMaxProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas(){
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }

    @Override

    public String toString(){
        return  "Nome: " + getNome() +
                "\nQuantidade de funcionários: " + getQuantidadeFuncionarios() +
                "\nSalário base dos funcionários: R$ " + String.format("%.2f", getSalarioBaseFuncionario()) +
                "\nGastos com salário: R$ " + String.format("%.2f", gastosComSalario()) +
                "\nTamanho da loja:" + tamanhoDaLoja() +
                "\n" + getEndereco() +
                "\nData de fundação: " + getDataFundacao() +
                "\nQuantidade máxima de produtos disponível:" + getQuantMaxProduto() +
                "\nMeta de vendas: R$ " + String.format("%.2f", metaVendas);

    }
}
