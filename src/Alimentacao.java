public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int quantMaxProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara(){
        return  dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
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
                "\nData do alvará de funcionamento:" + dataAlvara;
    }
}
