
public class Informatica extends Loja{

    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantMaxProdutos, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override

    public String toString(){
        return  "Nome: " + getNome() +
                "\nQuantidade de funcionários: " + getQuantidadeFuncionarios() +
                "\nSalário base dos funcionários: R$ " + String.format("%.2f", getSalarioBaseFuncionario()) +
                "\nGastos com salário: R$ " + String.format("%.2f", gastosComSalario()) +
                "\nTamanho da loja:" + tamanhoDaLoja() +
                "\n" + getEndereco() +
                "\nData de fundação:" + getDataFundacao() +
                "\nQuantidade máxima de produtos disponível:" + getQuantMaxProduto() +
                "\nValor do seguro:" + String.format("%.2f", seguroEletronicos);
    }
}
